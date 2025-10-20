package com.jpa.hibernate.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @EmbeddedId
    private ProductKey productKey;

    private String color;

    public ProductKey getProductKey() {
        return productKey;
    }

    public void setProductKey(ProductKey productKey) {
        this.productKey = productKey;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
