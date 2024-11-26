package com.example.ToDo_App.services;

import java.time.Instant;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDo_App.model.ToDoItem;
import com.example.ToDo_App.repository.TodoItemRepository;

@Service
public class TodoItemService {
	@Autowired
	private TodoItemRepository todoItemRepository;
	
	public Optional<ToDoItem> getById(Long id){
		return todoItemRepository.findById(id);
	}
	public Iterable<ToDoItem> getAll(){
		return todoItemRepository.findAll();
	}
	
	public ToDoItem save(ToDoItem todoItem) {
		if(todoItem.getId()==null) {
			todoItem.setCreatedAt(Instant.now());
		}
		todoItem.setUpdatedAt(Instant.now());
		return todoItemRepository.save(todoItem);
	}
	public void delete(ToDoItem todoItem) {
		todoItemRepository.delete(todoItem);
	}
	
	

}
