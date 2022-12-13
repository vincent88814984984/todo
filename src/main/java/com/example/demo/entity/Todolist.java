package com.example.demo.entity;

import lombok.Data;

@Data
public class Todolist {
    private Integer id;
    private String todoList;
    private Boolean done;
}
