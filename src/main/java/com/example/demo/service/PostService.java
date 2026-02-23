package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {
    public PostService() {
    }

    public List<Post> listAllPosts() {
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }

    public void create(final String text) {
        Post post = new Post(null, text, new Date());
        postRepository.save(post);
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }

    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Autowired
    private PostRepository postRepository;
}