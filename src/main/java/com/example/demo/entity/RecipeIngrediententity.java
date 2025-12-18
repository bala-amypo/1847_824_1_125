package com.example.demo.entity;


@Entity
public class  RecipeIngrediententity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String menuItem;
    private String ingredient;
    


    
}