package com.springFramworkTest.spring5WebApp.controllers;

import com.springFramworkTest.spring5WebApp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AuthorController {
    private AuthorRepository authorReposInControl;

    public AuthorController(AuthorRepository authorReposInControl) {
        this.authorReposInControl = authorReposInControl;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model modelA){
        modelA.addAttribute("authors", authorReposInControl.findAll());
        return "authorsPage";
    }
}
