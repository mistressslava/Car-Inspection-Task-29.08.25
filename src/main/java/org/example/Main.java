package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(4, 5, true, true);

        CarInspectionService carInspectionService = new CarInspectionService(car);
        System.out.println(carInspectionService.checkCar());
    }
}