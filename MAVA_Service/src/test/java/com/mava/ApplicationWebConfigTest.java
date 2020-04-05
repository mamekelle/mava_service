package com.mava;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

public class ApplicationWebConfigTest {

	public static class MyCorsRegistry extends CorsRegistry {
		public Map<String, CorsConfiguration> getConfiguration() {
			return super.getCorsConfigurations();
		}
	}

	@Test
	public void testAddCorsMappings() {
		ApplicationWebConfig applicationWebConfig = new ApplicationWebConfig();
		MyCorsRegistry corsRegistry = new MyCorsRegistry();
		applicationWebConfig.addCorsMappings(corsRegistry);
		Map<String, CorsConfiguration> configuration = corsRegistry.getConfiguration();
		Assert.assertEquals("/**", configuration.keySet().iterator().next());
	}

}
