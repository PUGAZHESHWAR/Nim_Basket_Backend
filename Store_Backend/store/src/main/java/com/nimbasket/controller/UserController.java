package com.nimbasket.controller;

import com.nimbasket.model.customer.User_Customer;
import com.nimbasket.repository.UserRepository;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User_Customer createUser(@RequestBody User_Customer user) {
        return userRepository.save(user);
    }
}