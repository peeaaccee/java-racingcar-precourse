package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {
    @Test
    public void testCreate() {
        Cars cars = Cars.newCars("pobi,jun,joy");
        assertThat(cars).isNotNull();
    }
}