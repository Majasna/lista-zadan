package pl.wsb.students.course.app.controller;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.wsb.students.course.app.model.Positions;
import pl.wsb.students.course.app.model.TDList;
import pl.wsb.students.course.app.model.user;
import pl.wsb.students.course.app.repository.ListRepository;
import pl.wsb.students.course.app.repository.PositionRepository;
import pl.wsb.students.course.app.repository.UserRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = {"/position"})
public class PositionController {
    @Autowired
    private PositionRepository PositionRepository;

    @Autowired
    private ListRepository ListRepository;

    @GetMapping("/{id}")
    public List<Positions> findAll(@PathVariable int id) {
        return PositionRepository.positionsList(id);
    }

    @PostMapping("/{id}")
    public Positions save(@Valid @NotNull @RequestBody Positions positions, @PathVariable int id){
        TDList listEntity = ListRepository.findById(id).orElse(null);
        positions.setTdList(listEntity);
        return PositionRepository.save(positions);
    }

    @PutMapping("/{id}")
    public Positions update(@Valid @NotNull @RequestBody Positions positions, @PathVariable int id){
        Positions positionEntity = PositionRepository.findById(id).orElse(null);
        positionEntity.setTitle(positions.getTitle());
        return PositionRepository.save(positionEntity);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable int id){
        PositionRepository.deleteById(id);
    }
}
