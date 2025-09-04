package Controllers;

import br.edu.unipaulistana.backend.Blog.controller.User;
import br.edu.unipaulistana.backend.Blog.controller.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//https://localhost:8080/users
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

        private final UserService userService;

    @GetMapping
    public List<User> findAll() {
        return this.userService.findAll();
    }
}
