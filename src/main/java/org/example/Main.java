package org.example;

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.setModel("Camry 70");
        mycar.setYear(2023);
        System.out.println(mycar.getModel());
        System.out.println(mycar.getYear());
    }
}