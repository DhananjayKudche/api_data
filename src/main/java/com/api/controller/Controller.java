package com.api.controller;

import com.api.service.Service;
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
    @GetMapping("/get")
    public String  getAllEmployees() {
        String res= service.getAllEmployees();
        return res;
    }
    @GetMapping("/get_dat_api")
    private String  getAllE(){
        String uri = "https://dummyjson.com/products/2";
        RestTemplate restTemplate= new RestTemplate();
        String result = restTemplate.getForObject(uri,String.class);
        return result;
    }
    private String jjj(){
        ObjectMapper objectMapper = new ObjectMapper();
       return "jjj";
    }

}
