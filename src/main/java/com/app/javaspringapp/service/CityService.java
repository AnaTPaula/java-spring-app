package com.app.javaspringapp.service;

import com.app.javaspringapp.model.httpresponse.CityApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CityService {

    private final RestTemplate restTemplate;
    private final ObjectMapper mapper;

   public String retriveCityInfo(String cep) throws JsonProcessingException {


        String url = "https://brasilapi.com.br/api/cep/v1/"+cep;
        ResponseEntity<CityApiResponse>result = restTemplate.exchange(url, HttpMethod.GET,null,CityApiResponse.class);

        return mapper.writeValueAsString(result.getBody());
    }
}
