package junit.class02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberCheckerTest {

    private PrimerNumberChecker primerNumberChecker;

    @BeforeEach
    public void init() {
        primerNumberChecker = new PrimerNumberChecker();
    }

    public static Collection<Object[]> numbers() {
        return Arrays.asList(new Object[][] {
                {2, true},
                {6, false},
                {28, false},
                {19, true}
        });
    }

    @ParameterizedTest
    @MethodSource("numbers")
    public void testPrimeNumberChecker(int number, boolean expectedResult) {
        System.out.println("Number: " + number + ", expected result: " + expectedResult);
        assertEquals(expectedResult, primerNumberChecker.validate(number));
    }


}
