package com.jpa.hibernate.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ProductKey implements Serializable {

    private String code;

    private long number;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
}
