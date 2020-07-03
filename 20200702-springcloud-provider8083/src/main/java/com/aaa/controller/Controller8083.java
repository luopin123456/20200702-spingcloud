package com.aaa.controller;

import com.aaa.model.Book;
import com.aaa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller8083 {
    @Autowired
    private BookService bookService;
    @GetMapping("/all")
    public List<Book> selectAll(){
        System.out.println("8083");
        return bookService.selectAll();
    }
}
