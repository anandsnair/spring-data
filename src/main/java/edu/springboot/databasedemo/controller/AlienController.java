package edu.springboot.databasedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.springboot.databasedemo.model.Alien;
import edu.springboot.databasedemo.service.AlienService;

@RestController
@RequestMapping("/api")
public class AlienController {

	@Autowired
	AlienService alienService;
	
	@PostMapping("/alien")
	public Alien createAlien(@RequestBody Alien alien) {
		return alienService.createAlien(alien);
	}
	
	@GetMapping("/aliens")
	public List<Alien> getAllNotes() {
	    return alienService.findAllAliens();
	}

}
