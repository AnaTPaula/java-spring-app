package com.app.javaspringapp.model.httpresponse;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class CityApiResponse {
    final private String cep;
    final private String state;
    final private String city;
    final private String neighborhood;
    final private String street;
    final private String service;
}
