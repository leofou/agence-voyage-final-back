package com.mjourney.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public TrainRide findOne(@PathParam("idTrainRide") Long id) {
		return iTrainRideService.findOne(id);
	}

	@PostMapping("/trainRides")
	public TrainRide save(@RequestBody TrainRide trainRide) {
		return iTrainRideService.save(trainRide);
	}

	@DeleteMapping("/trainRides/{idTrainRide}")
	public void delete(@PathParam("idTrainRide")Long id) {
		iTrainRideService.delete(id);
		
	}

}
