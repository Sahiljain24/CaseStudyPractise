package com.TeluskoFirst.learning.model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Alien {
    private int id;
    private String Name;
    private  String Tech;

    public Alien() {
    }

    public Alien(int id, String name, String tech) {
        this.id = id;
        Name = name;
        Tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Tech='" + Tech + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTech(String tech) {
        Tech = tech;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getTech() {
        return Tech;
    }




}
