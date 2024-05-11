package com.app.javaspringapp.service;

import org.springframework.stereotype.Service;

@Service
public class CityService {

    public String retriveCityInfo(String cep){

        return "OK" + cep;
    }
}
