package com.example.demo.repositories;

import java.util.List;

import com.example.demo.entities.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    public List<Post> findByAuthorId(Long authorId);
    
}
