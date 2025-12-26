package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println(new BCryptPasswordEncoder().encode("Amypo"));

		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		if(encoder.matches("Amypo","")){
			System.out.println("password matched");
		}else{
			System.out.println("no match");
		}
		}
         
    }
}
