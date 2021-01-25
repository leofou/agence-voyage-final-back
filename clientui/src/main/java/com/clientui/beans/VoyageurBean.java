package com.clientui.beans;

public class VoyageurBean {

	private Long idVoyageur;
	private String nom;
	private String prenom;
	private String username;
	private String password;
	
	public VoyageurBean() {
		super();
	}

	public VoyageurBean(Long idVoyageur, String nom, String prenom, String username, String password) {
		super();
		this.idVoyageur = idVoyageur;
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
	}

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur + ", nom=" + nom + ", prenom=" + prenom + ", username=" + username
				+ ", password=" + password + "]";
	}

	public VoyageurBean(String nom, String prenom, String username, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
	}
}
