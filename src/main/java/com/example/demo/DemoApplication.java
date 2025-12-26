package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println(new BCryptPasswordEncoder().encode("1234"));

		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		if(encoder.matches("1234","$2a$10$xK8WnwT.t1fJVx6axkskhOf9o266gHgrX3TDaR1fgMMBUw/zvhsEu")){
			System.out.println("password matched");
		}else{
			System.out.println("no match");
		}
		}
         
    }

