package com.clientui.proxy;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.FlightBean;
import com.clientui.beans.TrainRideBean;

@FeignClient(name="microservice-journey", url="localhost:9078/")
public abstract interface MicroServiceJourneyProxy {
	
	@GetMapping(value="/flights")
	List<FlightBean> findAll();

	@GetMapping("/flights/{idFlight}")
	public FlightBean findOne(@PathParam("idFlight") Long idFlight);
	
	@PostMapping("/flights")
	public FlightBean save(@RequestBody FlightBean flight);
	
	@DeleteMapping("/flights/{idFlight}")
	public void delete(@PathParam("idFlight")Long idFlight);

//	@GetMapping(value="/trainRides")
//	List<TrainRideBean> findAll();
//
//	@GetMapping("/trainRides/{idTrainRide}")
//	public TrainRideBean findOne(@PathParam("idTrainRide") Long idTrainRide);
//	
//	@PostMapping("/trainRides")
//	public TrainRideBean save(@RequestBody TrainRideBean trainRide);
//	
//	@DeleteMapping("/trainRides/{idTrainRide}")
//	public void delete(@PathParam("idTrainRide")Long idTrainRide);

}
