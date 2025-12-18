package com.example.demo.entity;


@Entity
public class  ProfitCalculationRecordentity{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Menuitem;
    private BigDecimal totalCost;

   @CreationTimestamp 
   private Timestamp 
    
}