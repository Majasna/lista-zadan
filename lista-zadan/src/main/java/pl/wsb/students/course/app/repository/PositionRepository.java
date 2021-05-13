package pl.wsb.students.course.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.wsb.students.course.app.model.Positions;
import pl.wsb.students.course.app.model.TDList;

import java.util.List;

public interface PositionRepository extends JpaRepository<Positions, Integer> {
    @Query("select p from Positions p where p.tdList.id = :position_fk")
    public List<Positions> positionsList(@Param("position_fk") Integer id);

}


