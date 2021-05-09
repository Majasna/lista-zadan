package pl.wsb.students.course.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wsb.students.course.app.repository.ListRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class ListController {
    @Autowired
    private ListRepository listRepository;

    @GetMapping
    public List<List> findAll(){
        return ListRepository.findAll();
    }

    @PostMapping
    public List save(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @PutMapping
    public TodoItem update(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable long id){
        todoRepo.deleteById(id);
    }
}
