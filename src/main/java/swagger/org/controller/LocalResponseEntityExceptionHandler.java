package swagger.org.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import swagger.org.exception.EmployeeNotFoundException;
import swagger.org.model.Employee;
import swagger.org.model.ExceptionResponse;

@RestController
@ControllerAdvice
public class LocalResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	public final ResponseEntity<ExceptionResponse> handleException(EmployeeNotFoundException ex, WebRequest request){
		ExceptionResponse response = new ExceptionResponse(LocalDate.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<ExceptionResponse>(response,HttpStatus.NOT_FOUND);
	}

}
