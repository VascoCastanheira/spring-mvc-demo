package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/funny")
@Controller
public class FunnyController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "funny";
	}
	@RequestMapping("/processForm")
	public String process(@RequestParam("studentName") String name, Model model) {
		return null;
	}
}
