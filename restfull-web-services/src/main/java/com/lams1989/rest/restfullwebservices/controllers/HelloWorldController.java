package com.lams1989.rest.restfullwebservices.controllers;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource message;
	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		logger.info(message.getMessage("info.hello.world.info", null, LocaleContextHolder.getLocale()));
		return message.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
		
	}
}
