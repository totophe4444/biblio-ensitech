package com.example.biliotheque1.entity;

import jakarta.persistence.*;

public class LivreInit {
	private String titre;
	private int nbExemplaire;
	private int nbPages;
	private String image;
	private String description;
	
	public LivreInit() {}
	public LivreInit(String titre, int nbExemplaire, int nbPages, String image, String description) {
		this.titre = titre;
		this.nbExemplaire = nbExemplaire;
		this.nbPages = nbPages;
		this.image = image;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", nbExemplaire=" + nbExemplaire + ", nbPages=" + nbPages + ", image=" + image
				+ /*", description=" + description + */ "]";
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public int getNbExemplaire() {
		return nbExemplaire;
	}
	public void setNbExemplaire(int nbExemplaire) {
		this.nbExemplaire = nbExemplaire;
	}
	public int getNbPages() {
		return nbPages;
	}
	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}   
}
