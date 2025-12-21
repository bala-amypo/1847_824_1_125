
package com.example.demo.service;

import com.example.demo.entity.MenuItementity;

import java.util.List;

public interface MenuItemservice {

    MenuItementity createMenuItem(MenuItementity menuItem);

    MenuItementity updateMenuItem(Long id, MenuItementity menuItem);

    MenuItementity getMenuItemById(Long id);

    List<MenuItementity> getAllMenuItems();

    void deleteMenuItem(Long id);
}
