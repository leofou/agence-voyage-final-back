package com.mjourney.service.interfaces;

import java.util.List;

import com.mjourney.entities.TrainRide;

public interface ITrainRideService {
	
	List<TrainRide> findAll();
	TrainRide findOne(Long id);
	TrainRide save(TrainRide journey);
	void delete(Long id);

}
