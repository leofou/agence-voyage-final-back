package com.mvoyageur.services;

import java.util.List;

import com.mvoyageur.entities.Voyageur;

public interface VoyageurService {
	
	List<Voyageur> findAll();
	
	Voyageur findOne(Long id);
	
	Voyageur save(Voyageur voyageur);
	
	void delete(Long id);

}
