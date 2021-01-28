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

import com.mjourney.entities.TrainRide;
import com.mjourney.service.interfaces.ITrainRideService;

@RestController
public class TrainRideController {
	
	@Autowired
	ITrainRideService iTrainRideService;
	
	@GetMapping("/trainRides")
	public List<TrainRide> findAll() {
		return iTrainRideService.findAll();
	}

	@GetMapping("/trainRides/{idTrainRide}")
	public TrainRide findOne(@PathVariable("idTrainRide") Long id) {
		return iTrainRideService.findOne(id);
	}

	@PostMapping("/trainRides")
	public TrainRide save(@RequestBody TrainRide trainRide) {
		return iTrainRideService.save(trainRide);
	}

	@DeleteMapping("/trainRides/{idTrainRide}")
	public void delete(@PathVariable("idTrainRide")Long id) {
		iTrainRideService.delete(id);
	}

	@PutMapping(value="/trainRide/{idJourney}")
	public TrainRide update(@PathVariable("idJourney") Long idJourney, @RequestBody TrainRide trainRide) {
		TrainRide currentTrainRide = iTrainRideService.findOne(idJourney);
		currentTrainRide.setOriginLocationCodeId(trainRide.getOriginLocationCodeId());
		currentTrainRide.setDestinationLocationCodeId(trainRide.getDestinationLocationCodeId());
		currentTrainRide.setOperatingCompanyId(trainRide.getOperatingCompanyId());
		currentTrainRide.setStartDate(trainRide.getStartDate());
		currentTrainRide.setEndDate(trainRide.getEndDate());
		currentTrainRide.setCustomerIds(trainRide.getCustomerIds());
		return iTrainRideService.save(currentTrainRide);
	}
	
}
