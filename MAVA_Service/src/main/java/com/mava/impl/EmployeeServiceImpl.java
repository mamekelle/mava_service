package com.mava.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mava.dto.EmployeeDTO;
import com.mava.exception.BadRequestException;
import com.mava.exception.RecordNotFoundException;
import com.mava.mapper.EmployeeMapper;
import com.mava.model.Employee;
import com.mava.repository.EmployeeRepository;
import com.mava.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;

	@Override
	public List<EmployeeDTO> getAllEmployees() throws RecordNotFoundException {
		List<Employee> employeeList = repository.findAll();
		List<EmployeeDTO> employeeDTOList = new ArrayList<EmployeeDTO>();

		for (int i = 0; i < employeeList.size(); ++i) {
			employeeDTOList.add(EmployeeMapper.INSTANCE.employeeToEmployeeDto(employeeList.get(i)));
			employeeDTOList.get(i).setId(employeeList.get(i).getId());
		}

		return employeeDTOList;

	}

	@Override
	public EmployeeDTO getEmployeeById(Long id) throws RecordNotFoundException {
		Optional<Employee> employee = repository.findById(id);

		if (employee.isPresent()) {
			EmployeeDTO employeeDTO = EmployeeMapper.INSTANCE.employeeToEmployeeDto(employee.get());
			employeeDTO.setId(employee.get().getId());
			return employeeDTO;
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) throws BadRequestException {
		if (employeeDTO != null && employeeDTO.getFirstName() != null) {
			Employee employeEntity = EmployeeMapper.INSTANCE.employeeDtoToEntity(employeeDTO);
			Employee newEntity = repository.save(employeEntity);
			EmployeeDTO employeeDTOCreated = EmployeeMapper.INSTANCE.employeeToEmployeeDto(newEntity);
			employeeDTOCreated.setId(newEntity.getId());
			return employeeDTOCreated;
		} else
			throw new BadRequestException("Bad request body!");
	}

	@Override
	public void deleteEmployeeById(Long id) throws RecordNotFoundException {
		Optional<Employee> employee = repository.findById(id);

		if (employee.isPresent()) {
			repository.deleteById(id);
		} else {
			throw new RecordNotFoundException("No employee record exist for given id");
		}
	}

	@Override
	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO, Long id) throws RecordNotFoundException {
		Employee employeEntity = EmployeeMapper.INSTANCE.employeeDtoToEntity(employeeDTO);
		Optional<Employee> employee = repository.findById(id);

		if (employee.isPresent()) {
			Employee newEntity = employee.get();
			newEntity.setEmail(employeEntity.getEmail());
			newEntity.setFirstName(employeEntity.getFirstName());
			newEntity.setLastName(employeEntity.getLastName());
			newEntity = repository.save(newEntity);
			EmployeeDTO employeeDTOUpdated = EmployeeMapper.INSTANCE.employeeToEmployeeDto(newEntity);
			employeeDTOUpdated.setId(newEntity.getId());
			return employeeDTOUpdated;
		}
		return new EmployeeDTO();
	}
}