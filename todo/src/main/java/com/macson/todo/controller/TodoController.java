package com.macson.todo.controller;

import com.macson.todo.model.Todo;
import com.macson.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAllTodos(){
        return todoService.getAllTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Integer id){
        return todoService.getTodoById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo){
        return todoService.createTodo(todo);
    }

    @PutMapping
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo){
        try {
            Todo updatedTodo = todoService.updateTodo(todo.getId(), todo);
            return ResponseEntity.ok(updatedTodo);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoById(@PathVariable Integer id){
        todoService.deleteTodoById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/status/{id}/{status}")
    public ResponseEntity<Todo> updateStatus(@PathVariable Integer id, @PathVariable Boolean status){
        try {
            Todo updatedTodo = todoService.updateStatus(id, status);
            return ResponseEntity.ok(updatedTodo);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
