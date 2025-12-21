

package com.example.demo.service.impl;

import com.example.demo.entity.Userentity;
import com.example.demo.repository.UserRespository;
import com.example.demo.service.Userservice;
import org.springframework.stereotype.Service;

@Service
public class Userserviceimpl implements Userservice {

    private final UserRespository repository;

    public Userserviceimpl(UserRespository repository) {
        this.repository = repository;
    }

    @Override
    public Userentity register(Userentity user) {
        return repository.save(user);
    }

    @Override
    public Userentity getById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}