package com.example.ToDo_App.model;

import java.io.Serializable;
import java.time.Instant;

import jakarta.persistence.*;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="todo_items")
public class ToDoItem implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotBlank(message="Description is needed")
	
	private String description;
	private Boolean isComplete;
	private Instant createdAt;
	private Instant updatedAt;
	@Override
	public String toString() {
		return String.format("TodoItem{id=%d,description='%s',isComplete='%s',createdAt='%s',updatedAt='%s'}",
				id,description,isComplete,createdAt,updatedAt);
	}
	
	

}
