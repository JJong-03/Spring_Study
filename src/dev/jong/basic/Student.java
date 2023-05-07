package dev.jong.basic;


import javax.xml.namespace.QName;

public class Student extends AbstractPerson {
    public Student(String name, int age){
        super(name,age); // 부모 객체의 함수를 불러온다 -> 여기서는 AbstractPerson
    }

    public void speak(){
        System.out.println(String.format("My name is %s, and I am a student.", name));
    }
}
