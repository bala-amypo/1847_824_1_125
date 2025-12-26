package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println(new BCryptPasswordEncoder().encode("Amypo"));

		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		if(encoder.matches("Amypo","$2a$10$x3hpTqKAoS6lhSkx9YJAUume7JBy7KeHqcZRraHKmBJ7rbBuK3O1W")){
			System.out.println("password matched");
		}else{
			System.out.println("no match");
		}
		}
         
    }

