


package com.example.demo.controller;

import com.example.demo.entity.Userentity;
import com.example.demo.service.Userservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class Usercontroller {

    private final Userservice service;

    public Usercontroller(Userservice service) {
        this.service = service;
    }

    @PostMapping("/register")
    public Userentity register(@RequestBody Userentity user) {
        return service.register(user);
    }

    @GetMapping("/{id}")
    public Userentity getById(@PathVariable Long id) {
        return service.getById(id);
    }
}