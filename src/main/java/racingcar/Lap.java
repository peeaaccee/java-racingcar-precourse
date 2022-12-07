package racingcar;

public class Lap {
    private static final int ZERO = 0;

    private final int lap;
    private int currentLap = 0;

    private Lap(String lap) {
        int validateLap = validateInteger(lap);
        validateOverZero(validateLap);
        this.lap = validateLap;
    }
}
