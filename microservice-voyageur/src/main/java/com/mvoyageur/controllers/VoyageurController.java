package com.mvoyageur.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvoyageur.entities.Voyageur;
import com.mvoyageur.services.VoyageurService;

@RestController
public class VoyageurController {
	
	@Autowired
	VoyageurService voyageurService;
	
	@GetMapping("/voyageurs")
	public List<Voyageur> findAll() {
		return voyageurService.findAll();
	}

	@GetMapping("/voyageur/{id}")
	public Voyageur findOne(@PathParam("id") Long id) {
		return voyageurService.findOne(id);
	}

	@PostMapping("/voyageur")
	public Voyageur save(@RequestBody Voyageur voyageur) {
		return voyageurService.save(voyageur);
	}

	@DeleteMapping("/voyageur/{id}")
	public void delete(@PathParam("id") Long id) {
		voyageurService.delete(id);
	}

}
