package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController { 
	
	@GetMapping("/Client")
	public String getClient(){ 
		return "Client";
		
	}

}
