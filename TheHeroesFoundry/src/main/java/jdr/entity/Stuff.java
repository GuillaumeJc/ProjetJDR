package jdr.entity;

import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqStuff", sequenceName = "seq_stuff", initialValue = 1, allocationSize = 1)
@Embeddable
public class Stuff {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seqStuff")
	private Long id; 
	private int quantite; 
	
	public Stuff () {
		
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
