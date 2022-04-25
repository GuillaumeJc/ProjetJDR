package jdr.entity;


import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
@SequenceGenerator(name="seqPersonnage", sequenceName = "seq_personnage", initialValue = 1, allocationSize = 1)
public abstract class Personnage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seqPersonnage")
	private Long id;
	private double gold;
	private String nom;
	private String prenom;
	private int age;
	@Enumerated(EnumType.STRING)
	private Genre genre;
	@Enumerated(EnumType.STRING)
	private Alignement alignement; 
	@Enumerated(EnumType.STRING)
	private Race race;
	//@Embedded
	//@AttributeOverrides({ @AttributeOverride(name = "?", column = @Column(name = "?)),
		//@AttributeOverride(name = "rue", column = @Column(name = "person_street")),
		//@AttributeOverride(name = "codePostal", column = @Column(name = "person_zip_code")),
		//@AttributeOverride(name = "ville", column = @Column(name = "person_city")) })
	private Caracteristique caracteristique;
	@Embedded
	//@AttributeOverrides({ @AttributeOverride(name = "?", column = @Column(name = "?)),
			//@AttributeOverride(name = "rue", column = @Column(name = "person_street")),
			//@AttributeOverride(name = "codePostal", column = @Column(name = "person_zip_code")),
			//@AttributeOverride(name = "ville", column = @Column(name = "person_city")) })
	private Stats stats;
	@Embedded
	//@AttributeOverrides({ @AttributeOverride(name = "?", column = @Column(name = "?)),
			//@AttributeOverride(name = "rue", column = @Column(name = "person_street")),
			//@AttributeOverride(name = "codePostal", column = @Column(name = "person_zip_code")),
			//@AttributeOverride(name = "ville", column = @Column(name = "person_city")) })
	private Stuff stuff;
	//@Embedded
	//@AttributeOverrides({ @AttributeOverride(name = "?", column = @Column(name = "?)),
			//@AttributeOverride(name = "rue", column = @Column(name = "person_street")),
			//@AttributeOverride(name = "codePostal", column = @Column(name = "person_zip_code")),
			//@AttributeOverride(name = "ville", column = @Column(name = "person_city")) })
	private Metier metier;
	
	public Personnage() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getGold() {
		return gold;
	}

	public void setGold(double gold) {
		this.gold = gold;
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

	public Caracteristique getCaracteristique() {
		return caracteristique;
	}

	public void setCaracteristique(Caracteristique caracteristique) {
		this.caracteristique = caracteristique;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public Stuff getStuff() {
		return stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}

	public Metier getMetier() {
		return metier;
	}

	public void setMetier(Metier metier) {
		this.metier = metier;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personnage other = (Personnage) obj;
		return Objects.equals(id, other.id);
	}
	

}
