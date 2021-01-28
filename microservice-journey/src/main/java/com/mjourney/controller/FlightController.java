package com.mjourney.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mjourney.entities.Flight;
import com.mjourney.entities.Journey;
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
	public Flight findOne(@PathVariable("idJourney") Long idJourney) {
		return iFlightService.findOne(idJourney);
	}

	@PostMapping("/flights")
	public Flight save(@RequestBody Flight flight) {
		return iFlightService.save(flight);
	}

	@DeleteMapping("/flights/{idJourney}")
	public void delete(@PathVariable("idJourney")Long idJourney) {
		iFlightService.delete(idJourney);
	}
	
	@PutMapping(value="/flight/{idJourney}")
	public Flight update(@PathVariable("idJourney") Long idJourney, @RequestBody Flight flight) {
		Flight currentFlight = iFlightService.findOne(idJourney);
		currentFlight.setOriginLocationCodeId(flight.getOriginLocationCodeId());
		currentFlight.setDestinationLocationCodeId(flight.getDestinationLocationCodeId());
		currentFlight.setOperatingCompanyId(flight.getOperatingCompanyId());
		currentFlight.setStartDate(flight.getStartDate());
		currentFlight.setEndDate(flight.getEndDate());
		currentFlight.setCustomerIds(flight.getCustomerIds());
		currentFlight.setFlightNumber(flight.getFlightNumber());
		return iFlightService.save(currentFlight);
	}

}
