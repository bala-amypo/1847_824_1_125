// package com.example.demo.service.impl;

// import com.example.demo.dto.AuthRequest;
// import com.example.demo.dto.RegisterRequest;
// import com.example.demo.entity.UserEntity;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.service.UserService;
// import org.springframework.stereotype.Service;

// @Service
// public class UserServiceImpl implements UserService {

//     private final UserRepository repository;

//     public UserServiceImpl(UserRepository repository) {
//         this.repository = repository;
//     }

//     @Override
//     public UserEntity register(RegisterRequest request) {

//         if (repository.existsByEmail(request.getEmail())) {
//             throw new RuntimeException("Email already exists");
//         }

//         UserEntity user = new UserEntity();
//         user.setFullName(request.getFullName());
//         user.setEmail(request.getEmail());

//         user.setPassword(request.getPassword());

//         user.setRole(request.getRole());

//         return repository.save(user);
//     }

//     @Override
//     public UserEntity login(AuthRequest request) {

//         UserEntity user = repository.findByEmail(request.getEmail())
//                 .orElseThrow(() -> new RuntimeException("Invalid email"));

//         if (!user.getPassword().equals(request.getPassword())) {
//             throw new RuntimeException("Invalid password");
//         }

//         return user;
//     }
// }
