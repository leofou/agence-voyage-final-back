package com.mjourney.service.interfaces;

import java.util.List;

import com.mjourney.entities.Journey;

public interface IJourneyService {
	
	List<Journey> findAll();
	Journey findOne(Long id);
	Journey save(Journey journey);
	void delete(Long id);
	Journey update(Journey journey);

}
