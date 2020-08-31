package com.lams1989.rest.restfullwebservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lams1989.rest.restfullwebservices.config.Name;
import com.lams1989.rest.restfullwebservices.config.PersonV1;
import com.lams1989.rest.restfullwebservices.config.PersonV2;

@RestController
public class PersonVersioningController {
	 
	@GetMapping("v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Bod Charlie");
	}
	
	@GetMapping("v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(value="/person/param", params= "version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Bod Charlie");
	}
	
	@GetMapping(value="/person/param", params= "version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	@GetMapping(value="/person/header", headers= "X-API-VERSON=1")
	public PersonV1 headerV1() {
		return new PersonV1("Bod Charlie");
	}
	
	@GetMapping(value="/person/header", headers= "X-API-VERSON=2")
	public PersonV2 headerV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
}
