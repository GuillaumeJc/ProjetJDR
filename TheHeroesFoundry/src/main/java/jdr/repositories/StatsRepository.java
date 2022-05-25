package jdr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import jdr.entity.Stats;


public interface StatsRepository extends JpaRepository<Stats,Long> { 

}
