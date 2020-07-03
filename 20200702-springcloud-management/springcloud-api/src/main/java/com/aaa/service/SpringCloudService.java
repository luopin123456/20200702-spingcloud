package com.aaa.service;

import com.aaa.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "book-interface")
public interface SpringCloudService {
@GetMapping("/all")
    List<Book> selectAll();
}
