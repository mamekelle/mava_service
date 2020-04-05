package com.mava.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_EMPLOYEES")
public class Employee implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email", nullable = false, length = 200)
	private String email;

	/** The last creation date. */
	@Column(name = "creation_date")
	private LocalDateTime creationDate;

	/** The last creation user. */
	@Column(name = "creation_user")
	private String creationUser;

	/** The last modification date. */
	@Column(name = "last_modification_date")
	private LocalDateTime lastModificationDate;

	/** The last modification user. */
	@Column(name = "last_modification_user")
	private String lastModificationUser;

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
}