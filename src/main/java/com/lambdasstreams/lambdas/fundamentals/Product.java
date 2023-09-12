package com.lambdasstreams.lambdas.fundamentals;

import lombok.ToString;

@ToString
public class Product {
    private Long id;
    private String name;
    private Double price;

    private Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    private String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

}
