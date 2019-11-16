package com.springFramworkTest.spring5WebApp.controllers;

import com.springFramworkTest.spring5WebApp.repositories.AuthorRepository;
import com.springFramworkTest.spring5WebApp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ooksAndAuthorsController {
    private AuthorRepository authorReposInControl;
    private BookRepository bookReposInControl;

    public ooksAndAuthorsController(AuthorRepository authorReposInControl, BookRepository bookReposInControl) {
        this.authorReposInControl = authorReposInControl;
        this.bookReposInControl = bookReposInControl;
    }

    @RequestMapping("/bookAurhor")
    public String allIwant (Model modelA, Model modelB){
        modelA.addAttribute("authors", authorReposInControl.findAll());
        modelB.addAttribute("books", bookReposInControl.findAll());
        return "booksAndAuthors";
    }
}
