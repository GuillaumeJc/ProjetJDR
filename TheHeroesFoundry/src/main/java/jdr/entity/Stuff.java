package jdr.entity;

import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqStuff", sequenceName = "seq_stuff", initialValue = 1, allocationSize = 1)
@Embeddable
public class Stuff {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seqStuff")
	private Long id; 
	private int quantite;
	@ManyToOne
	@JoinColumn(name = "equipement_id", foreignKey = @ForeignKey(name = "stuff_equipement_id_fk"))
	private Equipement equipement;
	@ManyToOne
	@JoinColumn(name = "consommables_id", foreignKey = @ForeignKey(name = "stuff_consommables_id_fk"))
	private Consommables consommables;


	public Stuff () {
		
	}
	
	

	public Stuff(int quantite, Equipement equipement, Consommables consommables) {
		super();
		this.quantite = quantite;
		this.equipement = equipement;
		this.consommables = consommables;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	

	public Equipement getEquipement() {
		return equipement;
	}

	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
	}

	public Consommables getConsommables() {
		return consommables;
	}

	public void setConsommables(Consommables consommables) {
		this.consommables = consommables;
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
		Stuff other = (Stuff) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
