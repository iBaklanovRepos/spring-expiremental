package org.example.api;

import org.example.annotations.DeprecatedClass;
import org.example.annotations.InjectRandomInt;
import org.example.annotations.PostProxy;
import org.example.annotations.Profiling;

import javax.annotation.PostConstruct;

@Profiling
@DeprecatedClass(newImpl = GolangDeveloper.class)
public class PascalDeveloper implements Developer {
    @InjectRandomInt(min = 2, max = 8)
    private int times;

    public PascalDeveloper() {
        System.out.println("Phase 1");
    }

    @PostConstruct
    public void init() {
        System.out.println("Phase 2");
    }

    @Override
    @PostProxy
    public void speak() {
        System.out.println("Phase 3");
        for (int i = 0; i < times; i++) {
            System.out.println("I am so sad about Pascal being deprecated :(");
        }
    }
}

