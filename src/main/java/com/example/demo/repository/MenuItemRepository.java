
package com.example.demo.repository;

import com.example.demo.entity.MenuItementity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MenuItemrepositrory
        extends JpaRepository<MenuItementity, Long> {

    Optional<MenuItementity> findByName(String name);
}
