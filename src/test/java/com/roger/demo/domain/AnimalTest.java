package com.roger.demo.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AnimalTest {

    @Test
    public void animalSleepTest() {
        Animal animal = new Animal("Buddy", "Male", 5, 15.5, "Brown");
        animal.sleep();
        assertTrue(animal.getName().equals("Buddy"));
        assertEquals(5, animal.getAge());
        assertEquals(15.5, animal.getWeight(), 0.01); // Utilizando um delta para comparar números decimais
    }

    @Test
    public void catMeowTest() {
        Cat cat = new Cat("Whiskers", "Female", 3, 8.0, "Gray", true);
        cat.meow();
        assertTrue(cat.getColor().equals("Gray"));
        assertEquals(3, cat.getAge());
        assertTrue(cat.isNasty());
    }

    @Test
    public void dogBarkTest() {
        Human owner = new Human("John", 30);
        Dog dog = new Dog("Max", "Male", 2, 10.0, "Golden", owner);
        dog.bark();
        assertTrue(dog.getName().equals("Max"));
        assertEquals(2, dog.getAge());
        assertEquals(owner, dog.getBestFriend());
    }

    @Test
    public void humanTalkTest() {
        Human human = new Human("Alice", 25);
        human.talk();
        assertEquals("Alice", human.getName());
        assertEquals(25, human.getAge());
    }
}
