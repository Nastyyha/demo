package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Post;
import java.util.*;

@Service
public class PostService {

    // Поле для хранения всех постов
    private List<Post> posts;
    private Long nextId = 0L;  // Добавляем счетчик для ID

    // Блок инициализации - выполняется при создании объекта
    {
        posts = new ArrayList<>();

        // Добавляем ID первым аргументом в конструктор
        posts.add(new Post(nextId++, "Мой первый пост в блоге!", new Date()));
        posts.add(new Post(nextId++, "Сегодня прекрасный день для программирования на Spring Boot",
                new Date()));
        posts.add(new Post(nextId++, "Изучаю Thymeleaf и он мне нравится!", new Date()));
    }

    // Метод для получения всех постов
    public List<Post> listAllPosts() {
        return posts;
    }

    // Метод для создания нового поста - исправляем
    public Post create(String text) {
        Post newPost = new Post(nextId++, text, new Date());
        posts.add(newPost);
        return newPost;  // Возвращаем созданный пост
    }

    // Добавляем метод для получения поста по ID (понадобится позже)
    public Post getPost(Long id) {
        if (id != null && id.intValue() < posts.size()) {
            return posts.get(id.intValue());
        }
        return null;
    }
}