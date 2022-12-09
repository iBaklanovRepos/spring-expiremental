package org.example.api;

public class SeniorDeveloper implements Developer{

    @Override
    public void speak() {
        System.out.println("I can do anything, just give me a task");
    }
}
