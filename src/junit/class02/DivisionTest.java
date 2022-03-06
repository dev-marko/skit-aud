package junit.class02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    private Division division;

    @BeforeEach
    public void init() {
        division = new Division();
    }

    @Test
    public void testDivision() {
        assertThrows(ArithmeticException.class, () -> division.divide(4, 0));
    }
}
