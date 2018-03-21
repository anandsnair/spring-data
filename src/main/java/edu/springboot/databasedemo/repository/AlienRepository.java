package edu.springboot.databasedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.springboot.databasedemo.model.Alien;

@Repository
public interface AlienRepository extends JpaRepository<Alien, Integer> {

}
