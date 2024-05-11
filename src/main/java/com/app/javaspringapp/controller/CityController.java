package com.app.javaspringapp.controller;

import com.app.javaspringapp.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CityController {

    final private CityService service;

    @GetMapping("/city/v1/{cep}")
    public String get(@PathVariable("cep") String cep){

      String response = service.retriveCityInfo(cep);
      return response;
    }
}
