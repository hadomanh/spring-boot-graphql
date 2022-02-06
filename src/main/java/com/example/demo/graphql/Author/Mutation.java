package com.example.demo.graphql.Author;

import com.example.demo.entities.Author;
import com.example.demo.repositories.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component("AuthorMutation")
public class Mutation implements GraphQLMutationResolver {

    @Autowired private AuthorRepository authorRepository;

    public Author createAuthor(String name) {

        Author author = new Author();
        author.setName(name);

        return authorRepository.save(author);
    }
    
}
