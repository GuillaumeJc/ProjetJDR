package jdr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jdr.entity.Boutique;
import jdr.entity.Consommables;
import jdr.entity.Equipement;
import jdr.exceptions.BoutiqueException;
import jdr.repositories.BoutiqueRepository;

public class BoutiqueService {
	
	
	@Autowired
	private BoutiqueRepository boutiqueRepository;

	public List<Boutique> getAll() {
		return boutiqueRepository.findAll();
	}

	public Boutique getById(Long id) { //Ici on prend l'un des items present dans la boutique via son id
		return boutiqueRepository.findById(id).orElseThrow(BoutiqueException::new);
	}
	
	public Boutique getEquipementByLibelle(String libelle) { //Ici on prend l'un des items present dans la boutique via son id
		return boutiqueRepository.findEquipementByLibelle(libelle).orElseThrow(BoutiqueException::new);
	}

	public Boutique getConsommablesByLibelle(String libelle) { //Ici on prend l'un des items present dans la boutique via son id
		return boutiqueRepository.findConsommablesByLibelle(libelle).orElseThrow(BoutiqueException::new);
	}
	
	public Boutique create(Boutique boutique) { // on crée un objet 
		return boutiqueRepository.save(boutique);
	}
	
	public Boutique createEquipement(Equipement equipement) { // on crée un objet 
		return boutiqueRepository.save(equipement);
	}
	public Boutique createConsommable(Consommables consommables) { // on crée un objet 
		return boutiqueRepository.save(consommables);
	}
	public Boutique update(Boutique boutique) {
		return boutiqueRepository.save(boutique);
	}

	public void delete(Boutique boutique) {
		boutiqueRepository.delete(boutique);
	}

	public void deleteByIdConsommables(Long id) {
		Boutique boutique = new Consommables();
		boutique.setId(id);
		delete(boutique);
	}
	
	public void deleteByIdEquipement(Long id) {
		Boutique boutique = new Equipement();
		boutique.setId(id);
		delete(boutique);
	}
}
