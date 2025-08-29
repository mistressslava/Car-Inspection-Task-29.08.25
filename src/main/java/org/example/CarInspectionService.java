package org.example;

public class CarInspectionService {
    private Car car;

    public CarInspectionService(Car car) {
        this.car = car;
    }

    private boolean hasFourTires(Car car) {
        return car.getNumberOfTires() == 4;
    }

    private boolean hasASeatbelt(Car car) {
        return car.isSeatBelt();
    }

    private boolean hasAnAirbag(Car car) {
        return car.isAirbag();
    }

    private boolean hasThreeOrFiveDoors(Car car) {
        return (car.getNumberOfDoors() == 3 || car.getNumberOfDoors() == 5);
    }

    public boolean checkCar() {
        return hasFourTires(this.car) && hasASeatbelt(this.car) && hasAnAirbag(this.car) && hasThreeOrFiveDoors(this.car);
    }
}
