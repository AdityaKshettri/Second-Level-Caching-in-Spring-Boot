package com.aditya.project.caching.mapper;

import com.aditya.project.caching.dto.BookDto;
import com.aditya.project.caching.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    @Autowired
    private CurrencyMapper currencyMapper;

    public BookDto map(Book book) {
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        bookDto.setPrice(book.getPrice());
        bookDto.setDescription(book.getDescription());
        bookDto.setCurrency(currencyMapper.map(book.getCurrency()));
        return bookDto;
    }
}
