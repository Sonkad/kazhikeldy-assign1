package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {
    private String model = "Toyota Camry";

    @Autowired
    private Car car;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car getCar() {
        return car;
    }

    public void printLibraryInfo() {
        System.out.println(model + " has the car: " + car.getModel());
    }
}
