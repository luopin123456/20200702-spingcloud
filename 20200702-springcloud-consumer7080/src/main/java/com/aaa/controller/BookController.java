package com.aaa.controller;

import com.aaa.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("all")
    public List<Book> selectAll(){
        return restTemplate.getForObject("http://localhost:8081/all",List.class);
    }
}
