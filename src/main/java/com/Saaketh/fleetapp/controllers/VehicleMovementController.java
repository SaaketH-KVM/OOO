package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMovementController { 
	
	@GetMapping("/VehicleMovement")
	public String getVehicleMovement(){ 
		return "VehicleMovement";
		
	}

}
