package jdr.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqBoutique", sequenceName = "seq_consommables", initialValue = 1, allocationSize = 1)
public class Consommables extends Boutique {

	private String description; 
	
	public Consommables () {
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
