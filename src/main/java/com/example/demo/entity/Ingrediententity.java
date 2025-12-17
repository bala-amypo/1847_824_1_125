package com.example.demo.entity;


@Entity
public class  Ingrediententity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column(nullable = false,unique=true)
private String name;

@Column(nullable = false)
private String unit;

@Column(nullable = false, precision =10, scale =2)
private BigDecimal costperUnit;

@Column(nullable = false)
private Boolean active;

private LocalDateTime createdAt;
private LocalDateTime update;

@PrePersist
protected void onCreate(){
    createdAt = LocalDateTime.now();
    updateAt  = LocalDateTime.now();
}
@preUpdate
protected void onUpdate(){
    updateAt = LocalDateTime.now();
}


}

