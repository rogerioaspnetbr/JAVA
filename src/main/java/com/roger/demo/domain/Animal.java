package com.roger.demo.domain;

import lombok.*;

@Getter
@Setter
public class Animal {
    private String name;
    private String sex;
    private int age;
    private double weight;
    private String color;

    public Animal(String name, String sex, int age, double weight, String color) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void breathe() {
        System.out.println("The animal is breathing.");
    }

    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void run() {
        System.out.println("The animal is running.");
    }

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

