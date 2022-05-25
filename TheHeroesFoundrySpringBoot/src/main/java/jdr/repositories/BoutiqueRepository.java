package jdr.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jdr.entity.Boutique;
import jdr.entity.Consommables;
import jdr.entity.Equipement;
import jdr.entity.Joueur;
import jdr.entity.Personnage;

public interface BoutiqueRepository extends JpaRepository<Boutique, Long> { // Le JPA permet d'avoir le CRUD de base,
																			// c'est pour ça que la classe est vide :
																			// pas besoin de le coder(les méthodes
																			// chiantes sont implementées dans les
																			// services)

	@Query("select c from Consommables c where c.libelle=:libelle")
	Optional<Boutique> findConsommablesByLibelle(@Param("libelle") String libelle);

	@Query("select e from Equipement e where e.libelle=:libelle")
	Optional<Boutique> findEquipementByLibelle(@Param("libelle") String libelle);
	
	@Query("select e from Equipement")
	List<Equipement> findAllEquipement();
	
	@Query("select c from Consommables")
	List<Consommables> findAllConsommables();
}