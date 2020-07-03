package com.aaa.service;

import com.aaa.mapper.BookMapper;
import com.aaa.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;
    public List<Book> selectAll(){
        return bookMapper.selectAll();
    }
}
