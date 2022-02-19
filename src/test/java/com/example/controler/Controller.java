package com.example.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

	@RequestMapping("/hello")
	public String welcomepage() {
		return "Welcome to Yawin Tutor";
	}

}