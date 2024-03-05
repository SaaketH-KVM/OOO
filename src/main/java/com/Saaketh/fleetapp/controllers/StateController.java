package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StateController { 
	
	@GetMapping("/State")
	public String getState(){ 
		return "State";
		
	}

}
