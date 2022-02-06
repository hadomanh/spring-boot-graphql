package com.example.demo.graphql.Author;

import java.util.List;

import com.example.demo.entities.Author;
import com.example.demo.entities.Post;
import com.example.demo.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLResolver;

@Component("AuthorResolver")
public class Resolver implements GraphQLResolver<Author> {

    @Autowired private PostRepository postRepository;

    public List<Post> getPosts(Author author) {
        return postRepository.findByAuthorId(author.getId());
    }

    
}
