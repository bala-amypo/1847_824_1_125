package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.


@Entity
public class  Userentity{

    @Id
    @GeneratedValue(stratgy=GenerationType.IDENTITY)
    private Long id;
    private String fullname;

    @Column(unique=true)
    private String  email;
    
    private String active;
    private String role;
    
    @CreationTimestamp
    private Timestamp createdAt;

    @PerPersisit
    public void onCreate(){
    this createAt=new Timestamp(System.currentTimeMillis());
    }

    

   
    
}