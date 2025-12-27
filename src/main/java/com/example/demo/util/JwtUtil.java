package com.example.demo.util;

import com.example.demo.entity.User;
import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    public String generateToken(User user) {
        return "jwt-token";
    }

    public String extractUsername(String token) {
        return null;
    }

    public boolean validateToken(String token) {
        return true;
    }
}
