package com.roger.demo.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog extends Animal {
    private Human bestFriend;

    public Dog(String name, String sex, int age, double weight, String color, Human bestFriend) {
        super(name, sex, age, weight, color);
        this.bestFriend = bestFriend;
    }

    @Override
    public void breathe() {
        System.out.println("The dog is breathing.");
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }
}