

package com.example.demo.service;

import com.example.demo.entity.Userentity;

import java.util.List;

public interface Userservice {

    Userentity createUser(Userentity user);

    Userentity getUserById(Long id);

    List<Userentity> getAllUsers();

    void deleteUser(Long id);
}
