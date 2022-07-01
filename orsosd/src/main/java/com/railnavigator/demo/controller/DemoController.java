package com.railnavigator.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
//SWAGGER: http://localhost:8822/swagger-ui/
public class DemoController {
	private static final Logger LOGGER = LogManager.getLogger(DemoController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String defaultControllerFunction() {
		return "OK Tényleg";
	}

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String ping() {
		return "PONG";
	}


	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(String testParam) {
		return "Test is ok! param:" + testParam;
	}


}
