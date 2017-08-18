package com.sunlands.qa.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {
	

	@RequestMapping("/projects")
	public void list(){

	}
	
	@RequestMapping("/aa")
	public String save(){
		System.out.println("index..");
		return "index";
	}
}
