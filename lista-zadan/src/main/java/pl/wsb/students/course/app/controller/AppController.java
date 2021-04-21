package pl.wsb.students.course.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wsb.students.course.app.model.user;
import pl.wsb.students.course.app.repository.UserRepository;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    private UserRepository repo;

    @GetMapping("")
    public String ViewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String ShowSignupForm(Model model) {
        model.addAttribute("user", new user());
        return "signup_form";
    }
    @PostMapping("/process_register")
    public String processRegistration(user user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        repo.save(user);
        return "register_success";
    }

    @GetMapping("/list_users")
    public String viewUsersList(Model model) {
        List<user>listUsers = repo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }
}
