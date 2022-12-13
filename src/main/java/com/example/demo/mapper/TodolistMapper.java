package com.example.demo.mapper;

import com.example.demo.entity.Todolist;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TodolistMapper {
    @Select("select * from table_name")
    List<Todolist> getList();

    @Insert("INSERT into table_name (todoList) VALUES (#{todoList})")
    boolean addTodoList(Todolist body);

    @Update("update table_name set done = #{done} WHERE id=#{id}")
    boolean updateTodoList(Todolist body);

    @Delete("DELETE FROM table_name WHERE id=#{id}")
    boolean deleteList(Todolist body);
}
