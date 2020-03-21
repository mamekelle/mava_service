package com.mava.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * The Class LinkDTO.
 */
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
	 * Gets the rel.
	 *
	 * @return the rel
	 */
	public String getRel() {
		return rel;
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
	 * Gets the href.
	 *
	 * @return the href
	 */
	public String getHref() {
		return href;
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
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

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
