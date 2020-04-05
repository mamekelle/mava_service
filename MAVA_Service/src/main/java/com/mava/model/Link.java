package com.mava.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The Class Link.
 */
@Entity
@Table(name="links")
public class Link implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	/** The href. */
	private String href;

	/** The rel. */
	private String rel;

	/** The title. */
	private String title;

}