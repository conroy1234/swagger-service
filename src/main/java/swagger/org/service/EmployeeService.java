package swagger.org.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import swagger.org.model.Employee;
import swagger.org.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public Optional<Employee> findBuId(long id) {		
		return repository.findById(id);
	}
	
	public Iterable<Employee> findAll(){
		return repository.findAll();
		
	}
	
	public Employee save(Employee employee) {
		return repository.save(employee);
	}
	
	public Optional<Employee> delete(long id) {
		Optional<Employee> employee = findBuId(id);
		repository.delete(employee.get());
		return employee;
		
	}	

}
