package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {
	
	@GetMapping("/VehicleMake")
	public String getVehicleMake(){ 
		return "VehicleMake";
		
	}

}
