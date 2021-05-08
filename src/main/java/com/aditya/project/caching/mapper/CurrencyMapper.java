package com.aditya.project.caching.mapper;

import com.aditya.project.caching.dto.CurrencyDto;
import com.aditya.project.caching.entity.Currency;
import org.springframework.stereotype.Component;

@Component
public class CurrencyMapper {

    public CurrencyDto map(Currency currency) {
        CurrencyDto currencyDto = new CurrencyDto();
        currencyDto.setId(currency.getId());
        currencyDto.setCode(currency.getCode());
        currencyDto.setDescription(currency.getDescription());
        return currencyDto;
    }
}
