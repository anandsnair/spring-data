package edu.springboot.databasedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.springboot.databasedemo.model.Alien;
import edu.springboot.databasedemo.repository.AlienRepository;

@RestController
@RequestMapping("/api")
public class AlienController {

	@Autowired
	AlienRepository aRepository;
	
	@PostMapping("/alien")
	public Alien createAlien(@RequestBody Alien alien) {
		return aRepository.save(alien);
	}
	
	@GetMapping("/aliens")
	public List<Alien> getAllNotes() {
	    return aRepository.findAll();
	}

}
