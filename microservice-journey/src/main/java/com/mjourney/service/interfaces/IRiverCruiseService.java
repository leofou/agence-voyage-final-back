package com.mjourney.service.interfaces;

import java.util.List;

import com.mjourney.entities.RiverCruise;

public interface IRiverCruiseService {
	
	List<RiverCruise> findAll();
	RiverCruise findOne(Long id);
	RiverCruise save(RiverCruise journey);
	void delete(Long id);

}
