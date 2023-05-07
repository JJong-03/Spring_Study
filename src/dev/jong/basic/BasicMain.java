package dev.jong.basic;

import java.util.ArrayList;
import java.util.List;

public class BasicMain {
    public static void main(String[] args) {
        Person studentKim = new Student("Kim", 26);
        Person studentLee = new Student("Lee", 21);
        Person studentPark = new Student("Park", 23);

        Person lecturer = new Lecturer("Kim Jong Won", 35);

        List<Person> everyone = new ArrayList<>();
        everyone.add(studentKim);
        everyone.add(studentLee);
        everyone.add(studentPark);
        everyone.add(lecturer);

        for(Person person: everyone){
            person.speak();
        }
    }
}

