package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleHireController { 
	
	@GetMapping("/VehicleHire")
	public String getVehicleHire(){ 
		return "VehicleHire";
		
	}

}
