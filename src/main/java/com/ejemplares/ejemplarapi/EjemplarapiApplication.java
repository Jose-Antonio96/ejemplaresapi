package com.ejemplares.ejemplarapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EjemplarapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemplarapiApplication.class, args);
	}

	@Bean
//	public RestTemplate template() {
//		return new RestTemplate();
//	}
	
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
