package dev.jong.basic;

import dev.jong.AbstractCar;

public class Lecturer extends AbstractPerson {
    public Lecturer(String name, int age) {
        super(name, age);
    }
    public void speak(){
        System.out.println(String.format("My name is %s, and I am a student Lecturer Version", name));
    }
}
