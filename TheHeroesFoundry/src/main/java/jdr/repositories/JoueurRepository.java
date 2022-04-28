package jdr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jdr.entity.Joueur;


public interface JoueurRepository extends JpaRepository<Joueur,Long>  {

}
