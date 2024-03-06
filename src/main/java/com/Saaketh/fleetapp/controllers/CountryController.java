package com.Saaketh.fleetapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestParam;

import com.Saaketh.fleetapp.models.Country;
import com.Saaketh.fleetapp.services.CountryService;

@Controller
public class CountryController { 
	
	@Autowired
	private CountryService countryService;
		
	@GetMapping("/country")
	public String getCountries(Model model){ 
		
		List<Country> countryList = countryService.getCountries(); 
		System.out.println(countryList);
		model.addAttribute("country", countryList);
		return "Country";	
	} 
	
	@PostMapping("/country/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/country";
	}
	
	@GetMapping("/country/findById")
	public ResponseEntity<?> findById(@RequestParam("id") int id) {
		return ResponseEntity.ok(countryService.findById(id));
	}
	
	@RequestMapping(value="/country/update",method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Country country) {
		countryService.save(country);
		return "redirect:/country";
	}
	
	@RequestMapping(value="/country/delete",method= {RequestMethod.DELETE, RequestMethod.GET})
	public String update(Integer id) {
		countryService.delete(id);
		return "redirect:/country";
	}
	
}