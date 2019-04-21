package com.sahara.pojo;

import lombok.Data;

@Data
public class Article {
    private int id;
    private String  author;
    private String  title;
    private String  content;
    private int categoryID;
}
