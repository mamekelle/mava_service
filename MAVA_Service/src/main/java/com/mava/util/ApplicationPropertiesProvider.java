package com.mava.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class ApplicationPropertiesProvider.
 */
@Component
public class ApplicationPropertiesProvider {

	/** The oauth url. */
	@Value("${helper.oauth_url}")
	private String oauthUrl;
	

	public String getOauthUrl() {
		return oauthUrl;
	}

	public ApplicationPropertiesProvider init(String oauthUrl) {
		
		this.oauthUrl = oauthUrl;
		return this;
	}
	
	

}