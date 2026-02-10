package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PostsCreateController {
    @Autowired
    private PostService postService;
    // GET запрос - отображение формы создания поста
    @RequestMapping(path = "/new", method = RequestMethod.GET)
    public String create() {
        return "create";  // будет искать create.html в templates
    }

    // POST запрос - обработка данных формы
    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String doCreate(@ModelAttribute("text") String text) {
        postService.create(text);

        // TODO: здесь будет сохранение поста
        // Пока просто перенаправляем на главную страницу
        return "redirect:/";
    }
}