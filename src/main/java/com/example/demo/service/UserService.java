// package com.example.demo.service;

// import com.example.demo.dto.AuthRequest;
// import com.example.demo.dto.RegisterRequest;
// import com.example.demo.entity.UserEntity;

// public interface UserService {

//     UserEntity register(RegisterRequest request);

//     UserEntity login(AuthRequest request);
// }


package com.example.demo.service;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.User;

public interface UserService {

    User register(RegisterRequest request);

    User login(AuthRequest request);
}
