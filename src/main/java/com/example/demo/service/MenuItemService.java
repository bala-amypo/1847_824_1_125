package com.example.demo.service;

import com.example.demo.entity.MenuItemEntity;
import java.util.List;

public interface MenuItemService {

    MenuItemEntity create(MenuItemEntity item);

    List<MenuItemEntity> getAll();

    MenuItemEntity getById(Long id);

    MenuItemEntity update(Long id, MenuItemEntity item);

    void deactivate(Long id);
}
