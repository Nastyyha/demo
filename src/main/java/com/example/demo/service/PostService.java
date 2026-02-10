package com.example.demo.service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.example.demo.model.Post;
import java.util.*;


@Service
public class PostService {

    public List<Post> listAllPosts(){
        List<Post> posts = new ArrayList<>();

        posts.add(new Post("Мой первый пост в блоге!",new Date()));
        posts.add(new Post("Сегодня прекрасный день для программирования на Spring Boot",new Date()));
        posts.add(new Post("Изучаю Thymeleaf и он мне нравится!",new Date()));

        return posts;
    }
}
