package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController { 
	
	@GetMapping("/Location")
	public String getLocation(){ 
		return "Location";
		
	}

}
