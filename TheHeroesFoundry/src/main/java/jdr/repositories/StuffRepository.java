package jdr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jdr.entity.Stuff;


public interface StuffRepository extends JpaRepository<Stuff,Long> {

}
