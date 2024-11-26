package com.example.ToDo_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ToDo_App.model.ToDoItem;

@Repository
public interface TodoItemRepository extends JpaRepository<ToDoItem,Long>{
	

}
