package com.aditya.project.caching.mapper;

import com.aditya.project.caching.dto.BookDto;
import com.aditya.project.caching.entity.Book;
import com.aditya.project.caching.entity.Currency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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
        bookDto.setCurrency(currencyMapper.map(getCurrency(book)));
        return bookDto;
    }

    @Cacheable(value = "currencies", key = "#book.currency.id")
    private Currency getCurrency(Book book) {
        return book.getCurrency();
    }
}
