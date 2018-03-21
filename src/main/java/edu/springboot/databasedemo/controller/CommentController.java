package edu.springboot.databasedemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.springboot.databasedemo.model.Comment;
import edu.springboot.databasedemo.model.Post;
import edu.springboot.databasedemo.repository.CommentRepository;
import edu.springboot.databasedemo.repository.PostRepository;

@RestController
@RequestMapping("/api")
public class CommentController {
	
	
	@Autowired
	PostRepository pRepo;
	
	@Autowired
	CommentRepository cRepo;
	
	@PostMapping("/createComment/{postId}")
	public Comment createComment(@RequestBody Comment comment, @PathVariable("postId") Long postId) {
		Optional<Post> p = pRepo.findById(postId);
		Post post = p.get();
		comment.setPost(post);
		//post.getComments().add(comment);
		return cRepo.save(comment);
	}


}
