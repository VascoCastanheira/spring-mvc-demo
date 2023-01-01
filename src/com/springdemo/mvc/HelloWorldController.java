package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/hello")
@Controller
public class HelloWorldController {
	
	//show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello-world";
	}
	
	//method to add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String result = "Yo! " + name;
		
		model.addAttribute("message", result);
		
		return "hello-world";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsShoutDudeSpring(@RequestParam("studentName") String name, Model model) {
		
		name = name.toUpperCase();
		
		String result = "Yo! " + name + " spring is rocking!";
		
		model.addAttribute("message", result);
		
		return "hello-world";
	}
}
