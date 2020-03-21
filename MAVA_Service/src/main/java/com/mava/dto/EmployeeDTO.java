package com.mava.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonProperty;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SystemDTO getSystem() {
		return system;
	}

	public void setSystem(SystemDTO system) {
		this.system = system;
	}

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
