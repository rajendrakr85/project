package com.resume.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@GetMapping("/")
	public String getMsg() {
		return "Hello World. I like java";
	}
}
