package com.example.demo.service.impl;

import com.example.demo.entity.MenuItemEntity;
import com.example.demo.repository.MenuItemRepository;
import com.example.demo.service.MenuItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository repository;

    public MenuItemServiceImpl(MenuItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public MenuItemEntity create(MenuItemEntity item) {
        item.setActive(true);
        return repository.save(item);
    }

    @Override
    public List<MenuItemEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public MenuItemEntity getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public MenuItemEntity update(Long id, MenuItemEntity item) {
        MenuItemEntity existing = getById(id);
        existing.setName(item.getName());
        existing.setPrice(item.getPrice());
        return repository.save(existing);
    }

    @Override
    public void deactivate(Long id) {
        MenuItemEntity existing = getById(id);
        existing.setActive(false);
        repository.save(existing);
    }
}
