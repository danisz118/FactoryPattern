package com.company;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car toyota = carFactory.create("Toyota");
        Car BMW = carFactory.create("BMW");
        toyota.drive();
        BMW.drive();


	// write your code here
    }

}
