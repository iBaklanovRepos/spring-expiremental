package org.example;

import org.example.api.ColorFrame;
import org.example.api.Developer;
import org.example.config.AppConfig;
import org.example.infra.PropertyFileApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("settings.xml");
        xmlContext.getBean(Developer.class).speak();
        PropertyFileApplicationContext propertyContext = new PropertyFileApplicationContext("context.properties");
        propertyContext.getBean(Developer.class).speak();
        AnnotationConfigApplicationContext annotationConfig = new AnnotationConfigApplicationContext(AppConfig.class);
        while (true) {
            annotationConfig.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(500);
        }
    }
}