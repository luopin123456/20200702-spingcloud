package com.aaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.print.Book;
import java.util.List;

@RestController
public class Controller {
        @Autowired
    private RestTemplate restTemplate;
        @Autowired
    private LoadBalancerClient loadBalancerClient;
        @GetMapping("/all")
    public List<Book> selectAll(){
            return restTemplate.getForObject("http://book-interface/all",List.class);
        }
}
