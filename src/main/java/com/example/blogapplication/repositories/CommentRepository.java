package com.example.blogapplication.repositories;

import com.example.blogapplication.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository  extends JpaRepository<Comment,Long> {
}
