package ru.sala.is2.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.sala.is2.entity.User;
import ru.sala.is2.service.UserService;

@AllArgsConstructor(onConstructor = @__(@Autowired))
@Controller("/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user) {
        return "redirect:/user";//change
    }
}
