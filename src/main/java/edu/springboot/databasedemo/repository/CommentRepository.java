package edu.springboot.databasedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.springboot.databasedemo.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
