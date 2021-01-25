package com.mlocation.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlocation.repositories.LocationRepository;
import com.mlocation.service.interfaces.ILocationService;

@Service
public class LocationService implements ILocationService{
	
	@Autowired
	LocationRepository volRepository;

	@Override
	public List<Location> findAll() {
		return volRepository.findAll();
	}

	@Override
	public Location findOne(Long id) {
		return volRepository.findById(id).get();
	}

	@Override
	public Location save(Location vol) {
		return volRepository.save(vol);
	}

	@Override
	public void delete(Long id) {
		volRepository.deleteById(id);
		
	}

}
