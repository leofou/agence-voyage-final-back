package com.magencevoyage.service.interfaces;

import java.util.List;

import com.magencevoyage.entities.Utilisateur;

public interface IUtilisateurService {
	
	List<Utilisateur> findAll();
	
	Utilisateur findOne(Long idUtilisateur);
	Utilisateur save(Utilisateur utilisateur);
	void delete (Long idUtilisateur);
	
	Utilisateur findByUsername(String username);
	

}
