
package com.example.demo.service.impl;

import com.example.demo.entity.MenuItementity;
import com.example.demo.repository.MenuItemrepositrory;
import com.example.demo.service.MenuItemservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemserviceimpl implements MenuItemservice {

    private final MenuItemrepositrory repository;

    public MenuItemserviceimpl(MenuItemrepositrory repository) {
        this.repository = repository;
    }

    @Override
    public MenuItementity create(MenuItementity item) {
        return repository.save(item);
    }

    @Override
    public List<MenuItementity> getAll() {
        return repository.findAll();
    }

    @Override
    public MenuItementity getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public MenuItementity update(Long id, MenuItementity item) {
        item.setId(id);
        return repository.save(item);
    }

    @Override
    public void deactivate(Long id) {
        MenuItementity item = getById(id);
        item.setActive(false);
        repository.save(item);
    }
}
