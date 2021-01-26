package com.mjourney.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mjourney.entities.RiverCruise;
import com.mjourney.service.interfaces.IRiverCruiseService;

@RestController
public class RiverCruiseController {
	
	@Autowired
	IRiverCruiseService iRiverCruiseService;
	
	@GetMapping("/riverCruises")
	public List<RiverCruise> findAll() {
		return iRiverCruiseService.findAll();
	}

	@GetMapping("/riverCruises/{idRiverCruise}")
	public RiverCruise findOne(@PathParam("idRiverCruise") Long id) {
		return iRiverCruiseService.findOne(id);
	}

	@PostMapping("/riverCruises")
	public RiverCruise save(@RequestBody RiverCruise riverCruise) {
		return iRiverCruiseService.save(riverCruise);
	}

	@DeleteMapping("/riverCruises/{idRiverCruise}")
	public void delete(@PathParam("idRiverCruise")Long id) {
		iRiverCruiseService.delete(id);
		
	}

}
