package com.example.demo.graphql.Post;

import com.example.demo.entities.Author;
import com.example.demo.entities.Post;
import com.example.demo.repositories.AuthorRepository;
import com.example.demo.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLMutationResolver;

@Component("PostMutation")
public class Mutation implements GraphQLMutationResolver {

    @Autowired private PostRepository postRepository;

    @Autowired private AuthorRepository authorRepository;

    public Post createPost(String title, String content) {

        Author author = authorRepository.findById(1L).get();

        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        post.setAuthor(author);

        return postRepository.save(post);
    }

}
