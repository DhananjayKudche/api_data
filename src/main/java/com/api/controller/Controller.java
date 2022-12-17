package com.api.controller;

import com.api.entity.Entity;
import com.api.service.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class Controller {
    @Autowired
    private Service service;
    @Autowired
    private Entity entity;

    @GetMapping("/get")
    public String  getAllEmployees() {
        String res= service.getData();
        return res;
    }
    @GetMapping("/get_dat_api")
    private Entity  getAllE() throws JsonProcessingException {
        String uri = "https://dummyjson.com/products/2";
        RestTemplate restTemplate= new RestTemplate();
        String result = restTemplate.getForObject(uri,String.class);
        System.out.println("Below is the response in JSON format");
        System.out.println(result);
        ObjectMapper objectMapper = new ObjectMapper();
       Entity e = objectMapper.readValue(result, Entity.class);
       System.out.println("Below is the response in Object format");


        System.out.println(e);

        return e;
    }



}
