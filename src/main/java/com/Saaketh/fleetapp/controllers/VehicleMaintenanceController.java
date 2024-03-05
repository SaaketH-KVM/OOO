package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenanceController { 
	
	@GetMapping("/VehicleMaintenance")
	public String getVehicleMaintenance(){ 
		return "VehicleMaintenance";
		
	}

}
