package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {
	
	@GetMapping("/JobTitle")
	public String getJobTitle(){ 
		return "JobTitle";
		
	}

}
