package com.example.demo.service;

import com.example.demo.entity.MenuItem;
import java.util.List;

public interface MenuItemService {

    MenuItem create(MenuItem item);

    List<MenuItem> getAll();

    MenuItem getById(Long id);

    MenuItem update(Long id, MenuItemEntity item);

    void deactivate(Long id);
}
