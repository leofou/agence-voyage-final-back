package com.mjourney.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mjourney.entities.Journey;
import com.mjourney.service.interfaces.IJourneyService;

@RestController
public class JourneyController {
	
	@Autowired
	IJourneyService iJourneyService;
	
	@GetMapping("/journeys")
	public List<Journey> findAll() {
		return iJourneyService.findAll();
	}

	@GetMapping("/journeys/{idJourney}")
	public Journey findOne(@PathParam("idJourney") Long id) {
		return iJourneyService.findOne(id);
	}

	@PostMapping("/journeys")
	public Journey save(@RequestBody Journey journey) {
		return iJourneyService.save(journey);
	}

	@DeleteMapping("/journeys/{idJourney}")
	public void delete(@PathParam("idJourney")Long id) {
		iJourneyService.delete(id);
		
	}

}
