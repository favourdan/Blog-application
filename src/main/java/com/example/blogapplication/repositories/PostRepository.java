package com.example.blogapplication.repositories;

import com.example.blogapplication.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
