package com.prodian.StudentManagementSystem.Config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public Docket docketApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.prodian.StudentManagementSystem.Controller"))
				.paths(PathSelectors.any())
				.build();
//		http://localhost:8080/swagger-ui.html
//		http://localhost:8080/v2/api-docs        ----to generate document

	}
}
