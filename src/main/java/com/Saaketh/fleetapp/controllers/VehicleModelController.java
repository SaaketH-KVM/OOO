package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController { 
	
	@GetMapping("/VehicleModel")
	public String getVehicleModel(){ 
		return "VehicleModel";
		
	}

}
