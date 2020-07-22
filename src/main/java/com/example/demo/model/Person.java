package com.example.demo.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private String country;
    private String gender;

    public Person(String name, String country, String gender) {
        this.name = name;
        this.country = country;
        this.gender = gender;
    }
}
