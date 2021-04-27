package swagger.org.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import swagger.org.configuration.CloudConfiguration;
import swagger.org.exception.EmployeeNotFoundException;
import swagger.org.model.Employee;
import swagger.org.model.MaxAndMin;
import swagger.org.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	CloudConfiguration cloudConfiguration;

	@GetMapping(path = "/employee")
	public Iterable<Employee> finaAll() {
		return employeeService.findAll();

	}

	@GetMapping(path = "/employee/{id}")
	public Optional<Employee> findOne(@PathVariable long id) {
		Optional<Employee> employee = employeeService.findBuId(id);		
			if(employee.isEmpty()) {
				throw new EmployeeNotFoundException("cannot find tmployee with id " + id);
			}
			
		return employee;

	}

	@PostMapping(path = "/employee")
	private ResponseEntity<URI> saveEmployee(@RequestBody Employee employee) {

		Employee entity = employeeService.save(employee);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getId())
				.toUri();

		return new ResponseEntity<URI>(location, HttpStatus.CREATED);

	}
	
	@GetMapping(path = "/employee/max-min")
	public MaxAndMin getMaxAndMin() {
		return new MaxAndMin(cloudConfiguration.getMaximum(),cloudConfiguration.getMinimum());
		
	}

	@DeleteMapping(path = "/employee/{id}")
	private Optional<Employee> deleteEmployee(@PathVariable long id) {
		return employeeService.delete(id);

	}

}
