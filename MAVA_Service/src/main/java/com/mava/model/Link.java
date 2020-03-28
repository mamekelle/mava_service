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

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the href.
	 *
	 * @return the href
	 */
	public String getHref() {
		return this.href;
	}

	/**
	 * Sets the href.
	 *
	 * @param href the new href
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * Gets the rel.
	 *
	 * @return the rel
	 */
	public String getRel() {
		return this.rel;
	}

	/**
	 * Sets the rel.
	 *
	 * @param rel the new rel
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return this.title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}


}