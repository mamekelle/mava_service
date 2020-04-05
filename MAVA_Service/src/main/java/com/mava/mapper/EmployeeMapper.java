package com.mava.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.mava.dto.EmployeeDTO;
import com.mava.dto.LinkDTO;
import com.mava.model.Employee;
import com.mava.model.Link;

/**
 * Entity to DTO mapper interface.
 */
@Mapper
public interface EmployeeMapper {

	/** The instance. */
	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

	/**
	 * Generate EmployeeDTO from Link entity.
	 *
	 * @param Employee entity to map
	 * @return EmployeeDTO object
	 */
	@Mapping(source = "creationDate", target = "system.createdOn")
	@Mapping(source = "creationUser", target = "system.createdBy")
	@Mapping(source = "lastModificationUser", target = "system.lastUpdatedBy")
	@Mapping(source = "lastModificationDate", target = "system.lastUpdatedOn")
	EmployeeDTO employeeToEmployeeDto(Employee employee);

	/**
	 * Generate Employee entity from EmployeeDTO object.
	 *
	 * @param EmployeeDTO object to map
	 * @return Employee entity
	 */
	@Mapping(source = "system.createdOn", target = "creationDate")
	@Mapping(source = "system.createdBy", target = "creationUser")
	@Mapping(source = "system.lastUpdatedBy", target = "lastModificationUser")
	@Mapping(source = "system.lastUpdatedOn", target = "lastModificationDate")
	Employee employeeDtoToEntity(EmployeeDTO employeeDTO);

	/**
	 * Map.
	 *
	 * @param value the value
	 * @return the link DTO
	 */
	default LinkDTO map(Link value) {
		return LinkMapper.INSTANCE.linkToLinkDto(value);
	}

	/**
	 * Map.
	 *
	 * @param linkDTO the link DTO
	 * @return the link
	 */
	default Link map(LinkDTO linkDTO) {
		return LinkMapper.INSTANCE.linkDtoToEntity(linkDTO);
	}

}
