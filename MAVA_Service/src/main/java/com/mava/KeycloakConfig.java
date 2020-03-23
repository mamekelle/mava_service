package com.mava;

import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.keycloak.representations.AccessToken;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeycloakConfig {

	@Bean
	public KeycloakSpringBootConfigResolver keycloakConfigResolver() {
		return new KeycloakSpringBootConfigResolver();
	}
	
//	@Bean
//	public KeycloakSecurityContext keycloakSecurityContext() {
//		return new KeycloakSecurityContext();
//	}
//	
//	@Bean
//	public AccessToken accessToken() {
//		return new AccessToken();
//	}
}