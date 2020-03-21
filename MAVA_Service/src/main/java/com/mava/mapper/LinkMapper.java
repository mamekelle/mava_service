package com.mava.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.mava.dto.LinkDTO;
import com.mava.model.Link;

/**
 * Link entity to DTO mapper interface.
 */
@Mapper
public interface LinkMapper {

	/** The instance. */
	LinkMapper INSTANCE = Mappers.getMapper(LinkMapper.class);

	/**
	 * Generate LinkDTO from Link entity.
	 *
	 * @param link entity to map
	 * @return LinkDTO object
	 */
	LinkDTO linkToLinkDto(Link link);

	/**
	 * Generate Link entity from LinkDTO object.
	 *
	 * @param linkDTO object to map
	 * @return Link entity
	 */
	Link linkDtoToEntity(LinkDTO linkDTO);
}
