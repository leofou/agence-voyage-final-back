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

	@GetMapping("/flights/{idFlight}")
	public Flight findOne(@PathParam("idFlight") Long id) {
		return iFlightService.findOne(id);
	}

	@PostMapping("/flights")
	public Flight save(@RequestBody Flight flight) {
		return iFlightService.save(flight);
	}

	@DeleteMapping("/flights/{idFlight}")
	public void delete(@PathParam("idFlight")Long id) {
		iFlightService.delete(id);
		
	}

}
