package com.mava.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mava.dto.EmployeeDTO;
import com.mava.exception.BadRequestException;
import com.mava.exception.RecordNotFoundException;
import com.mava.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@GetMapping
	public ResponseEntity<List<EmployeeDTO>> getAllEmployees() throws RecordNotFoundException  {
		List<EmployeeDTO> list = this.service.getAllEmployees();
		return new ResponseEntity<List<EmployeeDTO>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
		EmployeeDTO entity = this.service.getEmployeeById(id);

		return new ResponseEntity<EmployeeDTO>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Object> createEmployee(@RequestBody @Valid EmployeeDTO employeeDTO,
			BindingResult result) throws BadRequestException {
		return new ResponseEntity<>(this.service.createEmployee(employeeDTO), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateEmployee(@PathVariable("id") Long id, @RequestBody @Valid EmployeeDTO employeeDTO,
			BindingResult result) throws RecordNotFoundException {
		return new ResponseEntity<>(this.service.updateEmployee(employeeDTO, id), HttpStatus.OK);
	}
	
	

	@DeleteMapping("/{id}")
	public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
		service.deleteEmployeeById(id);
		return HttpStatus.FORBIDDEN;
	}

}