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

    public Categoryentity(Boolean active, Timestamp createAt, String description, Long id, String name, BigDecimal sellingPrice, Timestamp updatedAt) {
        this.active = active;
        this.createAt = createAt;
        this.description = description;
        this.id = id;
        this.name = name;
        this.sellingPrice = sellingPrice;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(BigDecimal sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}