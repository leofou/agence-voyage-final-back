package com.mlocation.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mlocation.entities.Location;
import com.mlocation.service.interfaces.ILocationService;

@RestController
public class LocationController {
	
	@Autowired
	ILocationService iLocationService;
	
	@GetMapping("/locations")
	public List<Location> findAll() {
		return iLocationService.findAll();
	}

	@GetMapping("/locations/{codeLoc}")
	public Location findOne(@PathParam("codeLoc") Long codeLocation) {
		return iLocationService.findOne(codeLocation);
	}

	@PostMapping("/locations")
	public Location save(@RequestBody Location location) {
		return iLocationService.save(location);
	}

	@DeleteMapping("/locations/{codeLoc}")
	public void delete(@PathParam("codeLoc")Long codeLocation) {
		iLocationService.delete(codeLocation);
		
	}

}
