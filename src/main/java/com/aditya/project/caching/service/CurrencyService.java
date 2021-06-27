package com.aditya.project.caching.service;

import com.aditya.project.caching.dto.CurrencyDto;
import com.aditya.project.caching.entity.Currency;
import com.aditya.project.caching.mapper.CurrencyMapper;
import com.aditya.project.caching.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository repository;

    @Autowired
    private CurrencyMapper mapper;

    public CurrencyDto findById(int id) {
        Optional<Currency> currency = repository.findById(id);
        if (currency.isEmpty()) {
            throw new NullPointerException("Currency not found with id : " + id);
        }
        // To see the cache demo in console
        currency = repository.findById(id);
        return mapper.map(currency.get());
    }
}
