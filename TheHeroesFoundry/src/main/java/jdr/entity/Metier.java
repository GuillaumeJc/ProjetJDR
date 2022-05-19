package jdr.entity;

import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Embeddable
public class Metier {

	@Id
	private Long Id;
	private String Developpeur;
	private String Rh;
	private String ChefProjet;
	private String LeadTech;
	private String BusinessAnalyst;
	private String ProductOwner;
	
	public Metier() {
		
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getDeveloppeur() {
		return Developpeur;
	}

	public void setDeveloppeur(String developpeur) {
		Developpeur = developpeur;
	}

	public String getRh() {
		return Rh;
	}

	public void setRh(String rh) {
		Rh = rh;
	}

	public String getChefProjet() {
		return ChefProjet;
	}

	public void setChefProjet(String chefProjet) {
		ChefProjet = chefProjet;
	}

	public String getLeadTech() {
		return LeadTech;
	}

	public void setLeadTech(String leadTech) {
		LeadTech = leadTech;
	}

	public String getBusinessAnalyst() {
		return BusinessAnalyst;
	}

	public void setBusinessAnalyst(String businessAnalyst) {
		BusinessAnalyst = businessAnalyst;
	}

	public String getProductOwner() {
		return ProductOwner;
	}

	public void setProductOwner(String productOwner) {
		ProductOwner = productOwner;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Metier other = (Metier) obj;
		return Objects.equals(Id, other.Id);
	}
	
	
}
