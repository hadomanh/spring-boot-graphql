package com.example.demo.graphql.Author;

import java.util.List;

import com.example.demo.entities.Author;
import com.example.demo.repositories.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Component("AuthorQuery")
public class Query implements GraphQLQueryResolver {

    @Autowired private AuthorRepository authorRepository;

    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }
    
}
