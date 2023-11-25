import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    @DisplayName("Return 1 When 1")
    void testAppShouldReturn1When1IsPassed() {
        int excepted = 1;
        int input = 1;

        int actualSum = sumCalculator.sum(input);

        Assertions.assertEquals(excepted, actualSum);
    }

    @Test
    @DisplayName("Return 6 When 3")
    void testAppShouldReturn6When3IsPassed() {
        int excepted = 6;
        int input = 3;

        int actualSum = sumCalculator.sum(input);

        Assertions.assertEquals(excepted, actualSum);
    }

    @Test
    @DisplayName("Return Exception When 0 is Entered")
    void testCheckInShouldReturnExceptionWhen0IsEntered() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}

