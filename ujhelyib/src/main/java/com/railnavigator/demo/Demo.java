package com.railnavigator.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Demo implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(Demo.class);

	private static final String TAG = "TimetableGuru - " + Demo.class.getSimpleName();

	//private final TestClient testClient;


	public static void main(String[] args) {
		LOGGER.info("Starting Demo and endpoint.");
		SpringApplication.run(Demo.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info(TAG + " Running With settings: ");

	}

}
