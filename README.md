Todo App - Spring Boot REST API
A REST API for managing todos, built with Spring Boot, Spring Data JPA, and MySQL. Supports full CRUD operations, validation, and global exception handling.

Tech Stack
Java 17+
Spring Boot (Web, Data JPA, Validation)
MySQL - database
Maven - dependency management
Postman - API testing

Project Structure
com.example.todo.demo
├── DemoApplication.java          # Application entry point
├── todo.java                     # Entity class (maps to `todo` table)
├── ToDoRepository.java            # JPA repository (database layer)
├── ToDoService.java                # Business logic layer
├── ToDoController.java             # REST API endpoints
├── ToDoNotFoundException.java      # Custom exception
└── GlobalExceptionHandler.java     # Centralized exception handling

Features
Create, read, update, and delete todos
Mark a todo as completed
Fetch completed, pending, and overdue todos
Input validation (title and description cannot be empty)
Clean error messages via global exception handling

Sample Requests
Add a todo
POST /todo/add
Content-Type: application/json

{
    "title": "Buy milk",
    "description": "Get 2 liters",
    "isCompleted": false,
    "dueDate": "2026-06-25"
}


