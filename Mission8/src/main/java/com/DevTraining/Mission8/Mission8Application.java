package com.DevTraining.Mission8;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

@Log4j2
@SpringBootApplication
public class Mission8Application {

	public static void main(String[] args) {
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "test");
		SpringApplication.run(Mission8Application.class, args);
		log.info("Main is running");
	}

}
