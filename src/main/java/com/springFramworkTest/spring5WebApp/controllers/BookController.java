package com.springFramworkTest.spring5WebApp.controllers;

import com.springFramworkTest.spring5WebApp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private BookRepository bookReposInControl;

    public BookController(BookRepository bookReposInControl) {
        this.bookReposInControl = bookReposInControl;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books",bookReposInControl.findAll());
        return "books";
    }
}
