package edu.springboot.databasedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.springboot.databasedemo.model.Post;
import edu.springboot.databasedemo.repository.PostRepository;

@RestController
@RequestMapping("/api")
public class PostController {

	@Autowired
	PostRepository pRepo;
	
	@PostMapping("/createpost")
	public Post createPost(@RequestBody Post post) {
		return pRepo.save(post);
	}
	
	
}
