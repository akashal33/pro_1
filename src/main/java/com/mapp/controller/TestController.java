package com.mapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	/*
	 * @GetMapping("/welcome") public String index() { System.out.println("heere");
	 * return "index"; }
	 */
	
	
	@GetMapping("/hello.htm")
	public String wel() {
		System.out.println("heere");
		return "index";
	}
}

