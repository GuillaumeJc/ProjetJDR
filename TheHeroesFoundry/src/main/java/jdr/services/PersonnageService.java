package jdr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdr.entity.Admin;
import jdr.entity.Personnage;
import jdr.exceptions.AdminException;
import jdr.repositories.AdminRepository;

@Service
public class PersonnageService {

	@Autowired
	private AdminRepository adminRepository;

	  public List<Personnage> getAll() { return personnageRepository.findAll();
	 //blablabla

	public Personnage getById(Long id) {
		return personnageRepository.findById(id).orElseThrow(PersonnageException::new);
	}

	public void create(Admin admin) {
		if (personnage.getNom() == null || personnage.getNom().isEmpty()) {
			throw new PersonnageException();
		}
		personnageRepository.save(admin);
	}

}
