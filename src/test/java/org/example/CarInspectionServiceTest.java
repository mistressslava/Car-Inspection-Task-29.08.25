package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarInspectionServiceTest {

    @Test
    void checkCar() {
        Car car = new Car(4, 3, true, true);

        assertTrue(new CarInspectionService(car).checkCar());
    }
}