package com.example.demo.entity;

import jakarta.persistence.Entity;


@Entity
public class  Categoryentity{
    @Id
    @generationValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(unique =  true)
    private String name;

    private String description;
    private BigDecimal sellingPrice;
    private Boolean active;
    private Timestamp createAt;
    private Timestamp updatedAt;


    
}