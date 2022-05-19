package jdr.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jdr.entity.Boutique;
import jdr.entity.Joueur;
import jdr.entity.Personnage;

public interface BoutiqueRepository extends JpaRepository<Boutique, Long> { // Le JPA permet d'avoir le CRUD de base,
																			// c'est pour �a que la classe est vide :
																			// pas besoin de le coder(les m�thodes
																			// chiantes sont implement�es dans les
																			// services)

	@Query("select c from Consommables c where c.libelle=:libelle")
	Optional<Boutique> findConsommablesByLibelle(@Param("libelle") String libelle);

	@Query("select e from Equipement e where e.libelle=:libelle")
	Optional<Boutique> findEquipementByLibelle(@Param("libelle") String libelle);
}