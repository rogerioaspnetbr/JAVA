package com.roger.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat extends Animal {
    private boolean isNasty;

    public Cat(String name, String sex, int age, double weight, String color, boolean isNasty) {
        super(name, sex, age, weight, color);
        this.isNasty = isNasty;
    }

    @Override
    public void breathe() {
        System.out.println("The cat is breathing.");
    }

    public void meow() {
        System.out.println("The cat is meowing.");
    }
}
