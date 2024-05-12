package com.app.javaspringapp.service;

import com.app.javaspringapp.model.httpresponse.CityApiResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CityService {

    public String retriveCityInfo(String cep) throws JsonProcessingException {

        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();
        String url = "https://brasilapi.com.br/api/cep/v1/"+cep;
        ResponseEntity<CityApiResponse>result = restTemplate.exchange(url, HttpMethod.GET,null,CityApiResponse.class);

        return mapper.writeValueAsString(result.getBody());
    }
}
