package todo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {
    @Autowired
    ToDoService toDoService;
    @GetMapping("/all")
    public List<todo> getAllTodo(){
        return toDoService.getAllToDos();
    }
    @PostMapping("/add")
    public todo addToDo(@RequestBody todo todo){
        return toDoService.addToDo(todo);
    }
    @PutMapping("/update")
    public todo updateTodo(@RequestBody todo todo){
        return toDoService.updateToDo(todo);
    }
    @DeleteMapping("/delete")
    public void deleteToDo(@PathVariable int id){
        toDoService.deleteToDo(id);
    }
    @PutMapping("/complete/{id}")
    public todo completeToDo(@PathVariable int id){
        return toDoService.completeToDo(id);
    }

}
