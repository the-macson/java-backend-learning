package com.macson.todo.service;

import com.macson.todo.model.Todo;
import com.macson.todo.repo.TodoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRespository todoRepo;

    public List<Todo> getAllTodos(){
        return todoRepo.findAll();
    }

    public Todo createTodo(Todo todo){
        return todoRepo.save(todo);
    }

    public Optional<Todo> getTodoById(Integer id){
        return todoRepo.findById(id);
    }

    public Todo updateTodo(Integer id, Todo todoDetails){
        Todo todo = todoRepo.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
        todo.setTitle(todoDetails.getTitle());
        todo.setDescription(todoDetails.getDescription());
        todo.setCompleted(todoDetails.isCompleted());
        return todoRepo.save(todo);
    }

    public void deleteTodoById(Integer id){
        todoRepo.deleteById(id);
    }

    public Todo updateStatus(Integer id, Boolean status){
        Todo todo = todoRepo.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
        todo.setCompleted(status);
        return todoRepo.save(todo);
    }
}
