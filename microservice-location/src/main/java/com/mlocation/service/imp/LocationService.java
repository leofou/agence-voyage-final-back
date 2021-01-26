package com.mlocation.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mlocation.entities.Location;
import com.mlocation.repositories.LocationRepository;
import com.mlocation.service.interfaces.ILocationService;

@Service
public class LocationService implements ILocationService{
	
	@Autowired
	LocationRepository locationRepository;

	@Override
	public List<Location> findAll() {
		return locationRepository.findAll();
	}

	@Override
	public Location findOne(Long id) {
		return locationRepository.findById(id).get();
	}

	@Override
	public Location save(Location vol) {
		return locationRepository.save(vol);
	}

	@Override
	public void delete(Long id) {
		locationRepository.deleteById(id);
		
	}

}
