package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GasTankTest {
    private static final int BIG_NUMBER = 999999;

    @Test
    public void testCreate() {
        GasTank gasTank = GasTank.randomChargeGasTank();
        for (int i = 0; i < BIG_NUMBER; i++) {
            assertThat(gasTank.isEnoughGas()).isTrue();
        }
    }
}