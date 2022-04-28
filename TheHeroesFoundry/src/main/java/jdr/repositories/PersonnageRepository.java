package jdr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jdr.entity.Personnage;

public interface PersonnageRepository extends JpaRepository<Personnage,Long> {

}
