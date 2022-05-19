package jdr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jdr.entity.Boutique;

public interface BoutiqueRepository extends JpaRepository<Boutique, Long> { // Le JPA permet d'avoir le CRUD de base,
																			// c'est pour �a que la classe est vide :
																			// pas besoin de le coder(les m�thodes
																			// chiantes sont implement�es dans les
																			// services)

}
