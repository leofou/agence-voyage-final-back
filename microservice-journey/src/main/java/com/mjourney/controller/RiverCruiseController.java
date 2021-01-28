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

import com.mjourney.entities.RiverCruise;
import com.mjourney.service.interfaces.IRiverCruiseService;

@RestController
public class RiverCruiseController {
	
	@Autowired
	IRiverCruiseService iRiverCruiseService;
	
	@GetMapping("/riverCruises")
	public List<RiverCruise> findAll() {
		return iRiverCruiseService.findAll();
	}

	@GetMapping("/riverCruises/{idRiverCruise}")
	public RiverCruise findOne(@PathVariable("idRiverCruise") Long id) {
		return iRiverCruiseService.findOne(id);
	}

	@PostMapping("/riverCruises")
	public RiverCruise save(@RequestBody RiverCruise riverCruise) {
		return iRiverCruiseService.save(riverCruise);
	}

	@DeleteMapping("/riverCruises/{idRiverCruise}")
	public void delete(@PathVariable("idRiverCruise")Long id) {
		iRiverCruiseService.delete(id);
	}
	
	@PutMapping(value="/riverCruise/{idJourney}")
	public RiverCruise update(@PathVariable("idJourney") Long idJourney, @RequestBody RiverCruise riverCruise) {
		RiverCruise currentRiverCruise = iRiverCruiseService.findOne(idJourney);
		currentRiverCruise.setOriginLocationCodeId(riverCruise.getOriginLocationCodeId());
		currentRiverCruise.setDestinationLocationCodeId(riverCruise.getDestinationLocationCodeId());
		currentRiverCruise.setOperatingCompanyId(riverCruise.getOperatingCompanyId());
		currentRiverCruise.setStartDate(riverCruise.getStartDate());
		currentRiverCruise.setEndDate(riverCruise.getEndDate());
		currentRiverCruise.setCustomerIds(riverCruise.getCustomerIds());
		currentRiverCruise.setNameOfTheBoat(riverCruise.getNameOfTheBoat());
		currentRiverCruise.setPortOfRegistration(riverCruise.getPortOfRegistration());
		return iRiverCruiseService.save(currentRiverCruise);
	}

}
