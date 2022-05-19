package jdr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jdr.entity.Boutique;

public interface BoutiqueRepository extends JpaRepository<Boutique, Long> { // Le JPA permet d'avoir le CRUD de base,
																			// c'est pour ça que la classe est vide :
																			// pas besoin de le coder(les méthodes
																			// chiantes sont implementées dans les
																			// services)

}
