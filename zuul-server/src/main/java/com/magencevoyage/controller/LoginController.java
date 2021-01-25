package com.magencevoyage.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magencevoyage.entities.Utilisateur;
import com.magencevoyage.service.interfaces.IUtilisateurService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	IUtilisateurService utilisateurService;
	
	public Utilisateur login(Principal principal) {
		return utilisateurService.findByUsername(principal.getName());
	}
	

}
