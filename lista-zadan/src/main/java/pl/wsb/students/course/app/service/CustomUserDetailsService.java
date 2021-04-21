package pl.wsb.students.course.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.wsb.students.course.app.CustomUserDetails;
import pl.wsb.students.course.app.model.user;
import pl.wsb.students.course.app.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        user user = repo.findByLogin(login);
        if (user ==null) {
            throw new UsernameNotFoundException("Nie znaleziono użytkownika");
        }
        return new CustomUserDetails(user);
    }
}
