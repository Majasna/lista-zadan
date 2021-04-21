package pl.wsb.students.course.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import pl.wsb.students.course.app.model.user;
import pl.wsb.students.course.app.repository.UserRepository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser( ) {
        user user = new user();
        user.setLogin("testowy");
        user.setPassword("test123");
        user SavedUser = repo.save(user);

        user ExistUser = entityManager.find(user.class, SavedUser.getId());
        assertThat(ExistUser.getLogin()).isEqualTo(user.getLogin());

    }
    @Test
    public void testFindUserByLogin() {
        String login = "maja";
        user user = repo.findByLogin(login);
    }
}