package com.magencevoyage.service.imp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.magencevoyage.entities.Role;
import com.magencevoyage.entities.Utilisateur;
import com.magencevoyage.model.UtilisateurDetail;
import com.magencevoyage.service.interfaces.IUtilisateurService;

@Service
public class AppUserDetailService implements UserDetailsService{

	@Autowired
	IUtilisateurService  utilisateurService;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Utilisateur utilisateur = utilisateurService.findByUsername(username);
		Set<Role> roles = utilisateur.getRoles();
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		for (Role role: roles) {
			authorities.add(new SimpleGrantedAuthority(role.getLibelle()));
		}
		UtilisateurDetail utilisateurDetail = new UtilisateurDetail();
		utilisateurDetail.setUtilisateur(utilisateur);
		utilisateurDetail.setAuthorities(authorities);

		return utilisateurDetail;
	}

}
