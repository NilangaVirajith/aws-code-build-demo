package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @GetMapping("/person/{name}")
    public Person getPerson(@PathVariable("name") String name) {
        return new Person(name == null ? "Anonymous" : name, "Sri Lanka", "Male");
    }

    @GetMapping("/people")
    public List<Person> getPeople() {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Nilanga", "Sri Lanka", "Male"));
        people.add(new Person("Shash", "Sri Lanka", "Female"));
        people.add(new Person("Virajith", "Sri Lanka", "Male"));
        people.add(new Person("Virajith", "Sri Lanka", "Male"));

        return people;
    }

}
