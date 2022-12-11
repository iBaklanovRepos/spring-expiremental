package org.example;

import org.example.api.Developer;
import org.example.infra.PropertyFileApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("settings.xml");
//        context.getBean(Developer.class).speak();
        PropertyFileApplicationContext context = new PropertyFileApplicationContext("context.properties");
        context.getBean(Developer.class).speak();
    }
}