package com.example.practise.Controller.Practise;

import com.example.practise.Entity.User;
import com.example.practise.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping
public class Usercontroller {
    @Autowired
    private Userservice userservice;

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userservice.findAll();
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userservice.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
}
