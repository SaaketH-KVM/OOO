package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController { 
	
	@GetMapping("/EmployeeType")
	public String getEmployeeType(){ 
		return "EmployeeType";
		
	}

}
