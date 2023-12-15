package com.panda.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@RequestMapping("/")
	public String Pandas() {
		return "Hello Pandas";
	}
	@RequestMapping("/hello")
	public String HelloWorld() {
		return "Hello World! Pandas";
	}
}
