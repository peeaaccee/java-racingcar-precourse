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

    // 추가 기능 구현
}
