package com.manish.javadev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hellocontroller")
public class HelloController {

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String createAccount() {
		return "Manish";

	}

}
