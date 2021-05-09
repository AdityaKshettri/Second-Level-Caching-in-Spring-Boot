package com.aditya.project.caching.dto;

import lombok.Data;

@Data
public class BookDto {

    private int id;
    private String title;
    private int price;
    private String description;
    private CurrencyDto currency;
}
