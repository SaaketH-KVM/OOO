package com.Saaketh.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SupplierController { 
	
	@GetMapping("/Supplier")
	public String getSupplier(){ 
		return "Supplier";
		
	}

}
