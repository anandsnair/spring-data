package edu.springboot.databasedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.springboot.databasedemo.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
