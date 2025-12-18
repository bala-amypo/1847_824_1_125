package com.example.demo.entity;

import jakarta.persistence.Entity;


@Entity
public class  Categoryentity{
    @Id
    @generationValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(unique =  true)


    
}