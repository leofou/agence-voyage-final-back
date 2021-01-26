package com.mjourney.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjourney.entities.Flight;
import com.mjourney.repositories.FlightRepository;
import com.mjourney.service.interfaces.IFlightService;

@Service
public class FlightService implements IFlightService{
	
	@Autowired
	FlightRepository flightRepository;

	@Override
	public List<Flight> findAll() {
		return flightRepository.findAll();
	}

	@Override
	public Flight findOne(Long id) {
		return flightRepository.findById(id).get();
	}

	@Override
	public Flight save(Flight flight) {
		return flightRepository.save(flight);
	}

	@Override
	public void delete(Long id) {
		flightRepository.deleteById(id);
		
	}

}
