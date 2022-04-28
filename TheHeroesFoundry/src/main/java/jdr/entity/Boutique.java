package jdr.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Boutique {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqBoutique")
	protected Long id; 
	protected String nomStuff; 
	protected int prix; 
	protected boolean isAvailable ;
	
	public Boutique () {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomStuff() {
		return nomStuff;
	}

	public void setNomStuff(String nomStuff) {
		this.nomStuff = nomStuff;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
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
		Boutique other = (Boutique) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
