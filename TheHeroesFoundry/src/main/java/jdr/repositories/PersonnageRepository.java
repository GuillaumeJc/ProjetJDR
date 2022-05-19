package jdr.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jdr.entity.Personnage;

public interface PersonnageRepository extends JpaRepository<Personnage,Long> {

	@Query("select p from Personnage p left join fetch p.stuff where p.id=:id")
	Optional<Personnage> findByIdWithStuff(@Param("id") Long id);
}
