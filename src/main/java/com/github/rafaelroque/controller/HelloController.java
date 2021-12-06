package com.github.rafaelroque.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
public class HelloController {
	
	@GetMapping
	public String get() {
		return "Working...";
	}

}
