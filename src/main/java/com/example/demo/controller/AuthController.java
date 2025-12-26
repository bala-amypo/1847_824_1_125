package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.Entity.ExtraStudent;
// import com.example.demo1.Security.jwtutil;
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

        return "Login successful for " + student.getEmail();


        // String token = pd.generateToken(
        //         student.getEmail(),
        //         student.getRole()
        // );


        // return new AuthResponse(token, student.getRole());

    }
}