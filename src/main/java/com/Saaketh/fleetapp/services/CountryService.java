package com.Saaketh.fleetapp.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Saaketh.fleetapp.models.Country;
import com.Saaketh.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {  
	
	@Autowired 
	private CountryRepository countryRepository;
	 
	//return list of Countries
	public List<Country> getCountries() { 
		return  countryRepository.findAll();
		
	}
	 //save new country
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	//get by id
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}

}


