package com.Saaketh.fleetapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Saaketh.fleetapp.models.State;
import com.Saaketh.fleetapp.services.StateService;

@Controller
public class StateController { 
	
	@Autowired
	private StateService stateService;
		
	@GetMapping("/state")
	public String getStates(Model model){ 
		
		List<State> stateList = stateService.getStates(); 
		System.out.println(stateList);
		model.addAttribute("state", stateList);
		return "State";	
	} 
	
	@PostMapping("/state/addNew")
	public String addNew(State state) {
		stateService.save(state);
		return "redirect:/state";
	}
	
	@GetMapping("/state/findById")
	public ResponseEntity<?> findById(@RequestParam("id") int id) {
		return ResponseEntity.ok(stateService.findById(id));
	}
	
	@RequestMapping(value="/state/update",method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(State state) {
		stateService.save(state);
		return "redirect:/state";
	}
	
	@RequestMapping(value="/state/delete",method= {RequestMethod.DELETE, RequestMethod.GET})
	public String update(Integer id) {
		stateService.delete(id);
		return "redirect:/state";
	}

}
