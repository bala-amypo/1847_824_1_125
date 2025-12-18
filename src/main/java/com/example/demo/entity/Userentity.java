package com.example.demo.entity;


@Entity
public class  Userentity{

    @Id
    @GeneratedValue(stratgy=GenerationType.IDENTITY)
    private Long id;
    private String fullname;

    @Column(unique=true)
    private String  email;
    
    private String active;
    private String
    
    
}