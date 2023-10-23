package ru.tsygankov.springcourse.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class SecondController {

	@GetMapping("/exit")
	public String exit() {return "second/exit";} 
}
