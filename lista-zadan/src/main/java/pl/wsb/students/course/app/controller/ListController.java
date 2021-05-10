package pl.wsb.students.course.app.controller;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.wsb.students.course.app.model.TDList;
import pl.wsb.students.course.app.model.user;
import pl.wsb.students.course.app.repository.ListRepository;
import pl.wsb.students.course.app.repository.UserRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = {"/list"})
public class ListController {
    @Autowired
    private ListRepository ListRepository;

    @GetMapping
    public List<TDList> findAll() {
        return ListRepository.findAll();
    }

    @PostMapping
    public TDList save(@Valid @NotNull @RequestBody TDList list){
        return ListRepository.save(list);
    }

    @PutMapping
    public TDList update(@Valid @NotNull @RequestBody TDList list){
        return ListRepository.save(list);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable int id){
        ListRepository.deleteById(id);
    }
}
