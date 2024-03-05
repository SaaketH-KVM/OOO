package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleController { 
	
	@GetMapping("/Vehicle")
	public String getVehicle(){ 
		return "Vehicle";
		
	}

}
