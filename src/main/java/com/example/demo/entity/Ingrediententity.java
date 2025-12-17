package com.example.demo.entity;


@entity
public class  Ingrediententity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column(unique=true)
private String name;

private String unit;
private BigDecimal costperUnit;
private Boolean active;
private Timestamp crea
}

