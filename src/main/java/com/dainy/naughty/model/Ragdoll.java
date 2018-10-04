package com.dainy.naughty.model;

import com.dainy.naughty.utils.CatType;

public class Ragdoll extends Cat{
    public Ragdoll() {
        this.setType(CatType.Ragdoll);
    }

    public Ragdoll(Integer id, Integer age, String name, String type) {
        super(id, age, name, type);
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-28 18:14
 **/
