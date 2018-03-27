package edu.springboot.databasedemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.springboot.databasedemo.model.Alien;
import edu.springboot.databasedemo.model.Name;
import edu.springboot.databasedemo.repository.AlienRepository;
import edu.springboot.databasedemo.service.AlienService;

@Service
public class AlienServiceImpl implements AlienService {

	@Autowired
	private AlienRepository aRepo;
	
	@Override
	public Alien getAlienByName(Name name) {
		return aRepo.findByName(name);
	}

	@Override
	public List<Alien> findAllAliens() {
		return aRepo.findAll();
	}

	@Override
	public Alien createAlien(Alien alien) {
		return aRepo.save(alien);
	}

}
