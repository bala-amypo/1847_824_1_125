package com.example.demo.service;
import jakarta.persistence.service;
import com.example.demo.entity.MenuItemtentity;
@Service
public interface MenuItemservice{
    public MenuItem createMenuItem(MenuItem item);
    public updateMenuItem(Long id,MenuItem item);
    public getMenuItemById(Long id);
    public getallMenuItem();
    public deactiviateMenuItem(Long id);

}