package com.aditya.project.caching.controller;

import com.aditya.project.caching.dto.CurrencyDto;
import com.aditya.project.caching.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    @Autowired
    private CurrencyService service;

    @GetMapping("/{id}")
    public CurrencyDto findById(@PathVariable int id) {
        return service.findById(id);
    }
}
