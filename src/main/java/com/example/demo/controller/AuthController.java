package com.example.demo.controller;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.User;
import com.example.demo.security.JwtTokenProvider;
import com.example.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserService userService;

    public AuthController(AuthenticationManager authenticationManager,
                          JwtTokenProvider jwtTokenProvider,
                          UserService userService) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterRequest request) {
        return new ResponseEntity<>(userService.register(request), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(), request.getPassword()));

        User user = userService.login(request);
        String token = jwtTokenProvider.generateToken(null, user);

        return ResponseEntity.ok(new AuthResponse(token));
    }
}
 package com.example.demo1.Controller; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.Entity.ExtraStudent;
import com.example.demo1.Security.jwtutil;
import com.example.demo1.Service.ExtraStudentService;
import com.example.demo1.dto.AuthRequest;
import com.example.demo1.dto.AuthResponse;

// import org.springframework.security.crypto.password.PasswordEncoder;

@RestController
@RequestMapping("/auth")
public class AuthController {
   

    @PostMapping("/register")
    public ExtraStudent register(@RequestBody ExtraStudent stu) {
        return ser.saveExtraStudent(stu);
    }


//  @PostMapping("/login")
//     public String login(@RequestBody AuthRequest request) {
//         ExtraStudent student = ser.CheckEmail(request.getEmail());
//         if (student == null) {
//             throw new RuntimeException("User Not Found");

//         }
//         if (!encoder.matches(request.getPassword(), student.getPassword())) {
//             throw new RuntimeException("Invalid credentials");
//         }

//         return "Login successful for " + student.getEmail();
// }
@Autowired
    ExtraStudentService ser;
    @Autowired
    PasswordEncoder encoder;


    @Autowired jwtutil pd;

    @PostMapping("/add")
    public ExtraStudent addExtraStudent(@RequestBody ExtraStudent stu) {
        return ser.saveExtraStudent(stu);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        ExtraStudent student = ser.CheckEmail(request.getEmail());
        if (student == null) {
            throw new RuntimeException("User Not Found");

        }
        if (!encoder.matches(request.getPassword(), student.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        // return "Login successful for " + student.getEmail();


        String token = pd.generateToken(
                student.getEmail(),
                student.getRole()
        );


        return new AuthResponse(token, student.getRole());

    }
}