

package com.example.demo.repository;

import com.example.demo.entity.Categoryentity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryResposiory
        extends JpaRepository<Categoryentity, Long> {

    Optional<Categoryentity> findByName(String name);
}
