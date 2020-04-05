package com.mava.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter	

public class EmployeeDTO {

	/** The id. */
	@NotNull
	@JsonProperty("id")
	private Long id = null;
	
	@NotNull
	@NotEmpty
	@NotBlank
	@JsonProperty("firstName")
	private String firstName = null;

	@NotNull
	@NotEmpty
	@NotBlank
	@JsonProperty("lastName")
	private String lastName = null;

	@NotNull
	@NotEmpty
	@NotBlank
	@JsonProperty("email")
	private String email = null;

	/** The system. */
	@JsonProperty("system")
	private SystemDTO system = new SystemDTO();

	public  EmployeeDTO init(@NotNull @NotEmpty @NotBlank Long id, @NotNull @NotEmpty @NotBlank String firstName,
			@NotNull @NotEmpty @NotBlank String lastName, @NotNull @NotEmpty @NotBlank String email, SystemDTO system) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.system = system;
		return this;
	}
	

}
