package com.mava.service;

import java.util.List;

import com.mava.dto.EmployeeDTO;
import com.mava.exception.BadRequestException;
import com.mava.exception.RecordNotFoundException;

public interface EmployeeService {

	public List<EmployeeDTO> getAllEmployees() throws RecordNotFoundException;

	public EmployeeDTO getEmployeeById(Long id) throws RecordNotFoundException;

	public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) throws BadRequestException;

	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO, Long id) throws RecordNotFoundException;

	public void deleteEmployeeById(Long id) throws RecordNotFoundException;

}