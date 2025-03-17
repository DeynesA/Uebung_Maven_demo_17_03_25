package com.mycompany.app;

import com.google.gson.Gson;

class Person {
    String name;
    int age;
}

public class App {
    public static void main(String[] args) {
        String json = "{\"name\": \"Max\", \"age\": 25}";
        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);
        System.out.println("Name: " + person.name + ", Alter: " + person.age);
    }
}
