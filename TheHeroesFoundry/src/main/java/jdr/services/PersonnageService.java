package jdr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdr.entity.Personnage;
import jdr.exceptions.PersonnageException;
import jdr.repositories.PersonnageRepository;

@Service
public class PersonnageService {

	@Autowired
	private PersonnageRepository personnageRepository;

	public List<Personnage> getAll() {
		return personnageRepository.findAll();
	}

	public Personnage getById(Long id) {
		return personnageRepository.findById(id).orElseThrow(PersonnageException::new);
	}

	public Personnage getByPrenom(String prenom) {
		return personnageRepository.findByPrenom(prenom).orElseThrow(PersonnageException::new);
	}

	public Personnage getByNom(String nom) {
		return personnageRepository.findByNom(nom).orElseThrow(PersonnageException::new);
	}

	public Personnage getByIdWithStuff(Long id) {
		return personnageRepository.findByIdWithStuff(id).orElseThrow(RuntimeException::new);

	}

	public void create(Personnage personnage) {
		if (personnage.getNom() == null || personnage.getNom().isEmpty()) {
			throw new PersonnageException();
		}
		personnageRepository.save(personnage);
	}

	public Personnage update(Personnage personnage) {
		return personnageRepository.save(personnage);
	}

	public void delete(Personnage personnage) {
		personnageRepository.delete(personnage);
	}

	
	public void deleteById(Long id) {
		Personnage personnage = new Personnage(); // A VOIR AVEC OLIVIER
		personnage.setId(id);
		delete(personnage);
	}

}
