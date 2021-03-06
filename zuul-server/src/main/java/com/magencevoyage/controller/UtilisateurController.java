package com.magencevoyage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magencevoyage.entities.Utilisateur;
import com.magencevoyage.service.interfaces.IUtilisateurService;

@RestController
public class UtilisateurController {

	@Autowired
	IUtilisateurService utilisateurService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@GetMapping(value = "users")
	public List<Utilisateur> findAll(){
		return utilisateurService.findAll();
		
	}
	
	@GetMapping(value ="users/{idUser}")
	public Utilisateur findOne(@PathVariable("idUser") Long idUtilisateur) {
		return utilisateurService.findOne(idUtilisateur);
	}
	
	@RequestMapping(value = "users")
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		Utilisateur user = new Utilisateur();
		user.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
		user.setUsername(utilisateur.getUsername());
		user.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		user.setNomUtilisateur(utilisateur.getNomUtilisateur());
		user.setRoles(utilisateur.getRoles());
		return utilisateurService.save(utilisateur);
	}
	
	@DeleteMapping(value = "users/{idUser}")
	public void deleteUtilisateur(@PathVariable ("idUser") Long idUtilisateur) {
		utilisateurService.delete(idUtilisateur);
	}
}
