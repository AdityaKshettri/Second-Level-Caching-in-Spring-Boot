package com.aditya.project.caching.controller;

import com.aditya.project.caching.dto.BookDto;
import com.aditya.project.caching.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/{id}")
    public BookDto findById(@PathVariable int id) {
        return service.findById(id);
    }
}
