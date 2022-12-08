package racingcar;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

class RacingTest {

    @Test
    public void testCreate() {
        Scanner scanner = new Scanner(System.in);
        Racing racing = new Racing();
        racing.start(scanner);
    }
}