package com.mjourney.service.interfaces;

import java.util.List;

import com.mjourney.entities.Flight;

public interface IFlightService {
	
	List<Flight> findAll();
	Flight findOne(Long id);
	Flight save(Flight journey);
	void delete(Long id);
	Flight update(Flight flight);


}
