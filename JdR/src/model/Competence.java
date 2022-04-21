package model;

public class Competence {

	private String libelle;
	private Caracteristiques caracteristique;
	
	
	
	public Competence(String libelle,Caracteristiques carac) {
		this.libelle = libelle;
		this.caracteristique=carac;
	}
	
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

	public Caracteristiques getCaracteristique() {
		return caracteristique;
	}


	public void setCaracteristique(Caracteristiques caracteristique) {
		this.caracteristique = caracteristique;
	} 
	
	
}
