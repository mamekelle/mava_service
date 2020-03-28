package com.mava.util;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The Class WebConfig.
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.mava")
public class WebConfig  implements WebMvcConfigurer {

}
