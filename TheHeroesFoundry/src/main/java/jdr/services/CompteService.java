package jdr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdr.entity.Compte;
import jdr.entity.Joueur;
import jdr.repositories.CompteRepository;

@Service
public class CompteService {

	@Autowired
	private CompteRepository compteRepository;

	public List<Compte> getAll() {
		return compteRepository.findAll();
	}

	public List<Joueur> getAllFormateurs() {
		return compteRepository.findAllJoueurs();
	}

	public Compte getById(Long id) {
		return compteRepository.findById(id).orElseThrow(RuntimeException::new);
	}

	public Joueur getByIdWithPersonnages(Long id) {
		return compteRepository.findByIdWithPersonnages(id).orElseThrow(RuntimeException::new);
	}

	public Compte seConnecter(String login, String password) {
		return compteRepository.seConnecter(login, password).orElseThrow(RuntimeException::new);
	}

	public Compte create(Compte compte) {
		// encodage du mot de passe quand on saura faire
		// compte.setPassword(fonctionEncodage(compte.getPassword()));
		return compteRepository.save(compte);
	}

	public Compte update(Compte compte) {
		Compte compteEnBase = getById(compte.getId());
		compteEnBase.setLogin(compte.getLogin());
		compteEnBase.setNom(compte.getNom());
		compteEnBase.setPrenom(compte.getPrenom());
		return compteRepository.save(compteEnBase);
	}

//	public Compte updatePassword() {
//		
//	}

	public void delete(Compte compte) {
		compteRepository.delete(compte);
	}

	public void deleteByIdJoueur(Long id) {
		Compte compte = new Joueur();
		compte.setId(id);
		delete(compte);
	}

}
