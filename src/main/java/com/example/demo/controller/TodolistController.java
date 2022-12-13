package com.example.demo.controller;

import com.example.demo.entity.Todolist;
import com.example.demo.mapper.TodolistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodolistController {

    @Autowired
    private TodolistMapper todoListMapper;

    @PostMapping("add")
    public boolean add(@RequestBody Todolist body) {
        return todoListMapper.addTodoList(body);
    }


    @GetMapping("get")
    public List<Todolist> get() {
        List<Todolist> list = todoListMapper.getList();
        return list;
    }

    @PostMapping("delete")
    public boolean delete(@RequestBody Todolist body){
        return todoListMapper.deleteList(body);
    }


    @PostMapping("update")
    public boolean update(@RequestBody Todolist body) {
        return todoListMapper.updateTodoList(body);
    }
}
