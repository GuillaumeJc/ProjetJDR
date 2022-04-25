package jdr.entity;

import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Embeddable
public class Caracteristique {

	@Id
	private Long id;
	private int force; 
	private int dexterite;
	private int charisme;
	private int sagesse;
	private int intelligence;
	private int constitution;
	
	public Caracteristique() {
		
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getDexterite() {
		return dexterite;
	}

	public void setDexterite(int dexterite) {
		this.dexterite = dexterite;
	}

	public int getCharisme() {
		return charisme;
	}

	public void setCharisme(int charisme) {
		this.charisme = charisme;
	}

	public int getSagesse() {
		return sagesse;
	}

	public void setSagesse(int sagesse) {
		this.sagesse = sagesse;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
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
		Caracteristique other = (Caracteristique) obj;
		return Objects.equals(id, other.id);
	}
	
	
}

