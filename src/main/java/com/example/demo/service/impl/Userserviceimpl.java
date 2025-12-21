

package com.example.demo.service.impl;

import com.example.demo.entity.Userentity;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.Userservice;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimpl implements Userservice {

    private final UserRepository repository;

    public Userserviceimpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Userentity register(Userentity user) {
        return repository.save(user);
    }

    @Override
    public Userentity getById(Long id) {
        return repository.findById(id).orElseThrow(null);
    }
}