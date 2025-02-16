package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Car myCar = context.getBean(Car.class);
        myCar.drive();

        Engine engine = context.getBean(Engine.class);
        engine.start();
    }
}
