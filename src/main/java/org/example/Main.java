package org.example;

import org.example.api.Developer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("settings.xml");
        context.getBean(Developer.class).speak();
    }
}