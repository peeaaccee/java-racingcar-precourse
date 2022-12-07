package racingcar;

public class Car {

    private static final String ENTER_LINE = "\n";
    private static final String WHITE_SPACE = " ";
    private static final String NO_STRING = "";
    private static final String COLON = " : ";
    private static final String DASH = "-";
    private static final int MAX_LENGTH = 5;
    private static final int EMPTY = 0;

    private final String name;
    private int position = 0;

    public Car(String name) {
        validateEmpty(name);
        validateLength(name);
        this.name = name;
    }

    public static Car newCar(String name) {
        return new Car(name);
    }

    private void validateEmpty(String name) {
        if (name.length() == EMPTY || name.replaceAll(WHITE_SPACE, NO_STRING).length() == EMPTY) {
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }
    }

    private void validateLength(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("각 자동차의 이름은 5자 이하여야 합니다.");
        }
    }

}
