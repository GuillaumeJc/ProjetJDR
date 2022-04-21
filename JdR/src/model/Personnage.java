package model;

import java.util.ArrayList;
import java.util.List;

public class Personnage {
	
	
	private double gold;
	private int pv;
	private int niveau;
	private String nom;
	private String prenom;
	private int age;
	private Genre genre;
	private Alignement alignement; 
	private Race race;
	private Metier metier; 
	private List<Stats> stats =new ArrayList(); 
	private Emplacement emplacement; //A remettre dans le constructeur et dans les get/set
	private List<Competence> competences=new ArrayList(); 


	public Personnage(double gold, int pv, int niveau, String nom, String prenom, int age, Genre genre,
			Alignement alignement, Race race, Metier metier, List<Stats> stats, List<Competence> competences) {
		this.gold = gold;
		this.pv = pv;
		this.niveau = niveau;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.genre = genre;
		this.alignement = alignement;
		this.race = race;
		this.metier = metier;
		this.stats = stats;
		this.competences = competences;
	}


	public double getGold() {
		return gold;
	}


	public void setGold(double gold) {
		this.gold = gold;
	}


	public int getPv() {
		return pv;
	}


	public void setPv(int pv) {
		this.pv = pv;
	}


	public int getNiveau() {
		return niveau;
	}


	public void setNiveau(int niveau) {
		this.niveau = niveau;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public Alignement getAlignement() {
		return alignement;
	}


	public void setAlignement(Alignement alignement) {
		this.alignement = alignement;
	}


	public Race getRace() {
		return race;
	}


	public void setRace(Race race) {
		this.race = race;
	}


	public Metier getMetier() {
		return metier;
	}


	public void setMetier(Metier metier) {
		this.metier = metier;
	}


	public List<Stats> getStats() {
		return stats;
	}


	public void setStats(List<Stats> stats) {
		this.stats = stats;
	}


	public List<Competence> getCompetences() {
		return competences;
	}


	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}

	
	public int calculStat(Caracteristiques c) 
	{
		int total=0;
		for(Stats s : this.stats) 
		{
			if(s.getCaracteristique().equals(c)) 
			{
				total+=s.getValeur();
			}
		}
		
		for(Competence competence : competences)
		{
			if(competence.getCaracteristique().equals(c)) 
			{
				total+=2;
			}
		}
		return total;
	}

	@Override
	public String toString() {
		return "Personnage [gold=" + gold + ", pv=" + pv + ", niveau=" + niveau + ", nom=" + nom + ", prenom=" + prenom
				+ ", age=" + age + ", genre=" + genre + ", alignement=" + alignement + ", race=" + race + ", metier="
				+ metier + ", stats=" + stats + ", competences=" + competences + "]";
	}
	
	
}
