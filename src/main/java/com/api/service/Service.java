package com.api.service;

import com.api.entity.Entity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    public Entity getData(String uri) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        String url = restTemplate.getForObject(uri, String.class);
        System.out.println("Below is the response in JSON format");
        System.out.println(url);

        //ObjectMapper will convert JSON data into Object format
        ObjectMapper objectMapper = new ObjectMapper();
        Entity entity = objectMapper.readValue(url, Entity.class);

        System.out.println("Below is the response in Object format");
        System.out.println(entity);

        return entity;

    }

    public String fetchData(String uri) {
        RestTemplate restTemplate = new RestTemplate();
        String url = restTemplate.getForObject(uri, String.class);
        return url;
    }

}
