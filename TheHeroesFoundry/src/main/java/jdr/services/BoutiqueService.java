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


	public Boutique create(Boutique boutique) { // on crée un objet
		return boutiqueRepository.save(boutique);
	}

	public Boutique update(Boutique boutique) {
		return boutiqueRepository.save(boutique);
	}

	public void delete(Boutique boutique) {
		boutiqueRepository.delete(boutique);
	}

	
	//CONSOMMABLES 

	public Consommables getAllConsommables() {
		return (Consommables) boutiqueRepository.findAll();
	}

	public Consommables getByIdConsommables(Long id) { // Ici on prend l'un des items present dans la boutique via son id
		return (Consommables) boutiqueRepository.findById(id).orElseThrow(BoutiqueException::new);
	}

	public Consommables getConsommablesByLibelle(String libelle) { // Ici on prend l'un des items present dans la boutique
		// via son id
		return (Consommables) boutiqueRepository.findConsommablesByLibelle(libelle).orElseThrow(BoutiqueException::new);
	}

	public Consommables createConsommables(Consommables consommables) { // on crée un objet
		return (Consommables) boutiqueRepository.save(consommables);
	}

	public Consommables updateConsommables (Consommables consommables) {
		return (Consommables)boutiqueRepository.save(consommables);
	}
	
	public void deleteByIdConsommables(Long id) {
		Consommables consommables = new Consommables();
		consommables.setId(id);
		delete(consommables);
	}
	
	
	
	//EQUIPEMENT


	public Equipement getAllEquipement() {
		return (Equipement) boutiqueRepository.findAll();
	}

	public Equipement getByIdEquipement(Long id) { // Ici on prend l'un des items present dans la boutique via son id
		return (Equipement) boutiqueRepository.findById(id).orElseThrow(BoutiqueException::new);
	}
	
	public Equipement getEquipementByLibelle(String libelle) { // Ici on prend l'un des items present dans la boutique
		// via son id
		return (Equipement) boutiqueRepository.findEquipementByLibelle(libelle).orElseThrow(BoutiqueException::new);
	}

	public Equipement createEquipement(Equipement equipement) { // on crée un objet
		return (Equipement) boutiqueRepository.save(equipement);
	}
	
	public Equipement updateEquipement (Equipement equipement) {
		return (Equipement)boutiqueRepository.save(equipement);
	}

	public void deleteByIdEquipement(Long id) {
		Equipement equipement = new Equipement();
		equipement.setId(id);
		delete(equipement);
	}
}
