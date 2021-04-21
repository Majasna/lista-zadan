package pl.wsb.students.course.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.wsb.students.course.app.model.user;

public interface UserRepository extends JpaRepository<user,Integer> {
    @Query ("SELECT u FROM user u WHERE u.login = ?1")
    user findByLogin(String login);

}
