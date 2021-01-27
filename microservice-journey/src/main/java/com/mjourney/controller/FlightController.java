package com.mjourney.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mjourney.entities.Flight;
import com.mjourney.service.interfaces.IFlightService;

@RestController
public class FlightController {
	
	@Autowired
	IFlightService iFlightService;
	
	@GetMapping("/flights")
	public List<Flight> findAll() {
		return iFlightService.findAll();
	}

	@GetMapping("/flights/{idJourney}")
	public Flight findOne(@PathParam("idJourney") Long idJourney) {
		return iFlightService.findOne(idJourney);
	}

	@PostMapping("/flights")
	public Flight save(@RequestBody Flight flight) {
		return iFlightService.save(flight);
	}

	@DeleteMapping("/flights/{idJourney}")
	public void delete(@PathParam("idJourney")Long idJourney) {
		iFlightService.delete(idJourney);
		
	}

}
