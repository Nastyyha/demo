package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Post;
import java.util.*;

@Service
public class PostService {

    // Поле для хранения всех постов
    private List<Post> posts;

    // Блок инициализации - выполняется при создании объекта
    {
        posts = new ArrayList<>();

        posts.add(new Post("Мой первый пост в блоге!", new Date()));


        posts.add(new Post("Сегодня прекрасный день для программирования на Spring Boot",
                new Date()));

        posts.add(new Post("Изучаю Thymeleaf и он мне нравится!", new Date()));
    }

    // Метод для получения всех постов
    public List<Post> listAllPosts() {
        return posts;  // теперь возвращаем поле, а не создаем новый список
    }

    // Метод для создания нового поста
    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}