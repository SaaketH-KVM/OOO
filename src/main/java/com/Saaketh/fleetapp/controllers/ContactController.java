package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController { 
	
	@GetMapping("/Contact")
	public String getContact(){ 
		return "Contact";
		
	}

}
