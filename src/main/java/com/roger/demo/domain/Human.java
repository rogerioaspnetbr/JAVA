package com.roger.demo.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Human {
    private String name;
    private int age;

    public void talk() {
        System.out.println("The human is talking.");
    }

    public void walk() {
        System.out.println("The human is walking.");
    }

    public void sleep() {
        System.out.println("The human is sleeping.");
    }
}
