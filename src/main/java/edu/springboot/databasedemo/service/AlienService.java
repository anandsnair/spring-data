package edu.springboot.databasedemo.service;

import java.util.List;

import edu.springboot.databasedemo.model.Alien;
import edu.springboot.databasedemo.model.Name;

public interface AlienService {

	public Alien getAlienByName(Name name);
	public List<Alien> findAllAliens();
	public Alien createAlien(Alien alien);
}
