package com.mava.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * The Class LinkDTO.
 */
@Getter
@Setter
public class LinkDTO {

	/** The rel. */
	@NotNull
	@NotEmpty
	@NotBlank
	private String rel;

	/** The href. */

	@NotNull
	@NotEmpty
	@NotBlank
	private String href;

	/** The title. */
	private String title;


	/**
	 * Inits the.
	 *
	 * @param rel the rel
	 * @param href the href
	 * @param title the title
	 * @return the link DTO
	 */
	public LinkDTO init(@NotNull @NotEmpty @NotBlank String rel, @NotNull @NotEmpty @NotBlank String href,
			String title) {
		this.rel = rel;
		this.href = href;
		this.title = title;
		return this;
	}

}
