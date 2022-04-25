package jdr.entity;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="seqCompte", sequenceName = "seq_admin", initialValue = 1, allocationSize = 1)
public class Admin extends Compte {
	
}
