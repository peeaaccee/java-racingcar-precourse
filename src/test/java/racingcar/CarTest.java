package racingcar;

import org.junit.jupiter.api.Test;

class CarTest {

    private static final String name = "pobi";
    private static final String secondname = "json";

    @Test
    public void testCreate() {
        Car car = Car.newCar(name);
        car.tryForward();

        Car secondCar = Car.newCar(secondname);
        secondCar.tryForward();
        secondCar.tryForward();
        secondCar.tryForward();
    }

}