package com.dainy.naughty.model;

import javax.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")

    private Integer id;

    @Column(name = "name")

    private String name;

    @Column(name = "password")

    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 17:45
 **/
