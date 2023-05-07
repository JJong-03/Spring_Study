package dev.jong.basic;

import java.nio.charset.StandardCharsets;

public abstract class AbstractPerson implements Person{
    protected String name;
    private  int age;

    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void speak() {
        System.out.println(String.format("Hi my name is %s", this.name));
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "AbstractPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
