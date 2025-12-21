


package com.example.demo.repository;

import com.example.demo.entity.Userentity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRespository
        extends JpaRepository<Userentity, Long> {

    Optional<Userentity> findByEmail(String email);

    boolean existsByEmail(String email);
}