package com.clientui.proxy;

import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.clientui.beans.FlightBean;
import com.clientui.beans.JourneyBean;
import com.clientui.beans.RiverCruiseBean;
import com.clientui.beans.TrainRideBean;

@FeignClient(name="microservice-journey", url="localhost:9078/")
public abstract interface MicroServiceJourneyProxy {

	//****************************   Partie Journeys   *****************************
	
	@GetMapping(value="/journeys")
	List<JourneyBean> findJourneys();

	@GetMapping("/journeys/{idJourney}")
	public JourneyBean findJourney(@PathVariable("idJourney") Long idJourney);
	
	@PostMapping("/journeys")
	public JourneyBean saveJourney(@RequestBody JourneyBean journey);
	
	@DeleteMapping("/journeys/{idJourney}")
	public void deleteJourney(@PathVariable("idJourney")Long idJourney);
	
	//****************************   Partie Flights   *****************************

	@GetMapping(value="/flights")
	List<FlightBean> findFlights();

	@GetMapping("/flights/{idJourney}")
	public FlightBean findFlight(@PathVariable("idJourney") Long idJourney);
	
	@PostMapping("/flights")
	public FlightBean saveFlight(@RequestBody FlightBean flight);
	
	@DeleteMapping("/flights/{idJourney}")
	public void deleteFlight(@PathVariable("idJourney")Long idJourney);

	//****************************   Partie TrainRides   *****************************

//	@GetMapping(value="/trainRides")
//	List<TrainRideBean> findTrainRides();
//
//	@GetMapping("/trainRides/{idJourney}")
//	public TrainRideBean findTrainRide(@PathParam("idJourney") Long idJourney);
//	
//	@PostMapping("/trainRides")
//	public TrainRideBean saveTrainRide(@RequestBody TrainRideBean trainRide);
//	
//	@DeleteMapping("/trainRides/{idJourney}")
//	public void deleteTrainRide(@PathParam("idJourney")Long idJourney);
//
//	//****************************   Partie RiverCruises   *****************************
//
//	@GetMapping(value="/riverCruises")
//	List<RiverCruiseBean> findRiverCruises();
//
//	@GetMapping("/riverCruises/{idJourney}")
//	public RiverCruiseBean findRiverCruise(@PathParam("idJourney") Long idJourney);
//	
//	@PostMapping("/riverCruises")
//	public RiverCruiseBean saveRiverCruise(@RequestBody RiverCruiseBean riverCruise);
//	
//	@DeleteMapping("/riverCruises/{idJourney}")
//	public void deleteRiverCruise(@PathParam("idJourney")Long idJourney);
}
