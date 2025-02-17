package com.example.demo.movie.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {

	
	@Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI springSwaggerExample() {
        return new OpenAPI()
        		.addSecurityItem(new SecurityRequirement().addList("BASIC"))
                
                .components( new Components()
                        .addSecuritySchemes("apiKey", securityScheme("apiKey"))
                        ).
                 addSecurityItem(new SecurityRequirement().addList("apiKey")) 
                .info(new Info().title("Movie Demo API Example")
                        .description("Spring Boot Swagger API List for Demo in relation to Movies Entity")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("https://example.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("Spring Swagger Example")
                        .url("https://example.com/docs"));
    }
    
    private SecurityScheme securityScheme(String name) {
        return new io.swagger.v3.oas.models.security.SecurityScheme()
            .type(io.swagger.v3.oas.models.security.SecurityScheme.Type.APIKEY)
            .in(io.swagger.v3.oas.models.security.SecurityScheme.In.HEADER)
            .name(name);
    }
}
