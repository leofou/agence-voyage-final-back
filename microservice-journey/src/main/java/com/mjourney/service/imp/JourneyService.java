package com.mjourney.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjourney.entities.Journey;
import com.mjourney.repositories.JourneyRepository;
import com.mjourney.service.interfaces.IJourneyService;

@Service
public class JourneyService implements IJourneyService{
	
	@Autowired
	JourneyRepository journeyRepository;

	@Override
	public List<Journey> findAll() {
		return journeyRepository.findAll();
	}

	@Override
	public Journey findOne(Long id) {
		return journeyRepository.findById(id).get();
	}

	@Override
	public Journey save(Journey journey) {
		return journeyRepository.save(journey);
	}

	@Override
	public void delete(Long id) {
		journeyRepository.deleteById(id);
		
	}

}
