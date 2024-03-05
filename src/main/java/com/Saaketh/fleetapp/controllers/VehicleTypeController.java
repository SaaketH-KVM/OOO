package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController { 
	
	@GetMapping("/VehicleType")
	public String getVehicleType(){ 
		return "VehicleType";
		
	}

}
