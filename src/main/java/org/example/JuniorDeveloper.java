package org.example;

import org.example.utils.InjectRandomInt;
import org.example.utils.Profiling;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Profiling
@Component
public class JuniorDeveloper implements Developer {
    @InjectRandomInt(min = 2, max = 8)
    private int times;

    public JuniorDeveloper() {
        System.out.println("Phase 1");
    }

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
        System.out.println(times);
    }

    @Override
    public void speak() {
        for (int i = 0; i < times; i++) {
            System.out.println("I don't know what to do, please help me!");
        }
    }
}

