package com.miranda.growappbackendpublic.controller;

import com.miranda.growappbackendpublic.model.User;
import com.miranda.growappbackendpublic.repository.UserRepository;
import com.miranda.growappbackendpublic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("growapp/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("users") //Simpel REST endpoint
    public List<User> getUsers() {
        return userService.findUsers();
    }

    @PostMapping(value = "user"/*,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE*/)
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
