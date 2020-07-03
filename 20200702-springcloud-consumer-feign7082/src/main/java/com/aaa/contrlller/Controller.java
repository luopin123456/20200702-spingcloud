package com.aaa.contrlller;

import com.aaa.model.Book;
import com.aaa.service.SpringCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private SpringCloudService springCloudService;
    @GetMapping("/all")
    public List<Book> selectAll(){
        return springCloudService.selectAll();
    }
}
