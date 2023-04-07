package com.api.controller;

import com.api.entity.Entity;
import com.api.service.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/get_data_api")
    private ResponseEntity<Entity> getData1() throws JsonProcessingException {
        //this function will give response in Object format
        String uri = "https://dummyjson.com/products/2";
        Entity result = service.getData(uri);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/fetchData")
    private String trial() {
        //this is created for trial purpose and this function will give data in JSON format
        String data = service.fetchData("https://dummyjson.com/products/4");

        return data;
    }
    @GetMapping("/fetchData")
    private String trial2() {
        //this is created for trial purpose and this function will give data in JSON format
        String data = service.fetchData("https://dummyjson.com/products/4");

        return data;
    }
    @GetMapping("/fetchData")
    private String trial3() {
        //this is created for trial purpose and this function will give data in JSON format
        String data = service.fetchData("https://dummyjson.com/products/4");
        System.out.println("something is added in first branch");

        return data;
    }

}
