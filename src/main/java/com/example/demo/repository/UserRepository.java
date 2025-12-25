// package com.example.demo.repository;

// import com.example.demo.entity.UserEntity;
// import org.springframework.data.jpa.repository.JpaRepository;

// import java.util.Optional;

// public interface UserRepository
//         extends JpaRepository<UserEntity, Long> {

//     Optional<UserEntity> findByEmail(String email);

//     boolean existsByEmail(String email);
// }




// package com.example.demo.repository;

// import org.springframework.data.jpa.repository.JpaRepository;

// public interface UserRepository extends JpaRepository<Object, Long> {
//     boolean existsByEmail(String email);
// }

package com.example.demo.repository;

import com.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository
        extends JpaRepository<UserEntity, Long> {

    boolean existsByEmail(String email);

    Optional<UserEntity> findByEmail(String email);
}
