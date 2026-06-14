package todo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ToDoService {
    @Autowired
    ToDoRepository toDoRepository;
    public List<todo> getAllToDos(){
        return toDoRepository.findAll();
    }
    public todo addToDo(todo todo){
        return toDoRepository.save(todo);
    }
    public todo updateToDo(todo todo){
        return toDoRepository.save(todo);
    }
    public void deleteToDo(int id){
        toDoRepository.deleteById(id);
    }
    public todo completeToDo(int id){
        todo todo=toDoRepository.findById(id).orElseThrow(()->new RuntimeException("todo not found"));
        todo.setCompleted(true);
        return toDoRepository.save(todo);
    }
}
