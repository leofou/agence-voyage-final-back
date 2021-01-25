package com.mvoyageur.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvoyageur.entities.Voyageur;
import com.mvoyageur.repositories.VoyageurRepository;
import com.mvoyageur.services.VoyageurService;

@Service
public class VoyageurServiceImpl implements VoyageurService{
	
	@Autowired
	VoyageurRepository voyageurRepository;

	@Override
	public List<Voyageur> findAll() {
		return voyageurRepository.findAll();
	}

	@Override
	public Voyageur findOne(Long id) {
		return voyageurRepository.findById(id).get();
	}

	@Override
	public Voyageur save(Voyageur voyageur) {
		return voyageurRepository.save(voyageur);
	}

	@Override
	public void delete(Long id) {
		voyageurRepository.deleteById(id);
	}

}
