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



package com.example.demo.service.impl;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.User;
import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // ⚠️ EXACT ORDER (TEST REQUIREMENT)
    public UserServiceImpl(UserRepository userRepository,
                           PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User register(RegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new BadRequestException("Email already in use");
        }

        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setFullName(request.getFullName());
        user.setRole(request.getRole());
        System.out.println("Encoded password: " + passwordEncoder.encode("yourpassword"));
        System.out.println("Login attempt with username: " + user.fullName);

        return userRepository.save(user);
    }

    @Override
    public User login(AuthRequest request) {

        return userRepository.findByEmail(request.getEmail())
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found"));
    }
}
