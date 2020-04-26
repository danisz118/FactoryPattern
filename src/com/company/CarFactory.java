package com.company;

public class CarFactory {
    public Car create(String typeOfCar){
        switch (typeOfCar){
            case "BMW" : return new BMW();
            case "Toyota" : return new Toyota();
            default:return null;
        }
    }
}
