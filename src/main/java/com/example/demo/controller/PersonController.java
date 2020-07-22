package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/person/{name}")
    public Person getPerson(@PathVariable("name") String name) {
        return new Person(name == null ? "Anonymous" : name, "Sri Lanka", "Male");
    }

}
