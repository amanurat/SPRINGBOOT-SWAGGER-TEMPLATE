package com.mskang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableSwagger
public class Application {

	private SpringSwaggerConfig springSwaggerConfig;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
		this.springSwaggerConfig = springSwaggerConfig;
	}

	@Bean
	public SwaggerSpringMvcPlugin customImplementation() {
		return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("spring-boot + swagger-springmvc + swagger-spring-mvc-ui Template", "spring-boot + swagger-springmvc + swagger-spring-mvc-ui Template API", "terms of service",
				"mskang8111@gmail.com", "Licence Type", "License URL");
		return apiInfo;
	}

}