package com.dainy.naughty.model;


import com.dainy.naughty.utils.CatType;

public class Birman extends Cat {
    private String price;

    public Birman() {
        this.setType(CatType.Birman);
    }

    public Birman(Integer id, Integer age, String name, String type, String price) {
        super(id, age, name, type);
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-28 18:15
 **/
