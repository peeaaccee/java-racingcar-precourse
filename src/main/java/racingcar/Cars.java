package racingcar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Cars {

    private static final String WHITE_SPACE = " ";
    private static final String NO_STRING = "";
    private static final String COMMA = ",";
    private static final char CHAR_COMMA = ',';
    private static final int EMPTY = 0;
    private static final int INIT_ZERO = 0;

    private final ArrayList<Car> cars;

    private Cars(String carNames) {
        validateEmpty(carNames);
        validateCommaCount(carNames);
        validateDuplicate(carNames);
        this.cars = enrollCars(carNames);
    }

    public static Cars newCars(String carNames) {
        return new Cars(carNames);
    }
}
