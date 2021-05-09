package com.aditya.project.caching.service;

import com.aditya.project.caching.dto.BookDto;
import com.aditya.project.caching.entity.Book;
import com.aditya.project.caching.mapper.BookMapper;
import com.aditya.project.caching.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    @Autowired
    private BookMapper mapper;

    public BookDto findById(int id) {
        Optional<Book> book = repository.findById(id);
        if (book.isEmpty()) {
            throw new NullPointerException("Book not found with id : " + id);
        }
        return mapper.map(book.get());
    }
}
