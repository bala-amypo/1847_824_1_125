package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.Userentity;

@service
public interface Userservice{
    public User register(RegisterRequest req);
    public User login(AuthRequest req);

}