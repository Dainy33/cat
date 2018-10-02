package com.dainy.naughty.model;

public class Persian extends Cat{

    public Persian() {
        this.setType(CatType.Persian);
    }

    public Persian(Integer id, Integer age, String name, String type) {
        super(id, age, name, type);
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-28 17:58
 **/
