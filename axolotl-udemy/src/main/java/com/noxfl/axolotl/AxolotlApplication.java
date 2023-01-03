package com.noxfl.axolotl;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
@EnableScheduling
public class AxolotlApplication {

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(AxolotlApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}