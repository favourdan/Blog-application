package com.example.blogapplication.repositories;

import com.example.blogapplication.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository<Long, Post> {
}
