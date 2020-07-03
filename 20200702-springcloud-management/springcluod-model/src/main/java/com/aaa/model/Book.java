package com.aaa.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
public class Book {
    private Long id;

    private String bookName;

    private Double bookPrice;

}
