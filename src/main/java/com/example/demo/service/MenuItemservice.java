package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.MenuItementity;
@Service
public interface MenuItemservice{
    public MenuItem createMenuItem(MenuItem item);
    public MenuItem updateMenuItem(Long id,MenuItem item);
    public MenuItem getMenuItemById(Long id);
    public MenuItem getallMenuItem();
    public MenuItem deactiviateMenuItem(Long id);

}