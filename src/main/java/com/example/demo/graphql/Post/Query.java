package com.example.demo.graphql.Post;

import java.util.List;

import com.example.demo.entities.Post;
import com.example.demo.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component("PostQuery")
public class Query implements GraphQLQueryResolver {

    @Autowired private PostRepository postRepository;

    public List<Post> getPosts() {
        return postRepository.findAll();
    }

}
