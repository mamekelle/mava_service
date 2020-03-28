package com.mava;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Manage the CORS problems to avoid errors during the response from a web page.
 * In this way GETs, POSTs and related response with be authorize to interact
 * with the web application 
 *
 */
@Configuration
@EnableWebMvc
public class ApplicationWebConfig implements WebMvcConfigurer {
	
	/**
	 * This method is used to manage the CORS authorization.
	 * The CorsRegistry mapping can be customized with more strict parameters. 
	 * The actual mapping allow all web paths 
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT","DELETE","PATCH");
		
	} 

}
