package pl.wsb.students.course.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wsb.students.course.app.model.TDList;

public interface PositionRepository extends JpaRepository<TDList, Integer> {

}
