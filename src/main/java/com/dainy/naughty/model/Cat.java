package com.dainy.naughty.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cat")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ClassType" ,discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("cat")
public class Cat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    private Integer age;
    private String name;
    private String type;

    public Cat() {
    }

    public Cat(Integer id, Integer age, String name, String type) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-28 18:23
 **/
