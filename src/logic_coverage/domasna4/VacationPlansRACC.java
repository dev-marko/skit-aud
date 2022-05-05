package logic_coverage.domasna4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

// This test set achieves RACC on the predicate in the canGoOnVacation() method
// inside the VacationPlans class.

// Comments inside the source method for the parameterized test
// show the test number and the values of moneySaved, moneyNeeded
// datesAreWorkingDays, canUseVacationDays and the expected value of the predicate (true or false)

// The tests that are implemented in my solution are 1, 2, 4, 5.

public class VacationPlansRACC {

    private VacationPlans vacationPlans;
    private Person person;
    private VacationDates vacationDates;

    public static Collection<Object[]> testSource() {
        return Arrays.asList(new Object[][]{
                {2, 1, true, 1, true},  // 1 - T, T, T, P(T)
                {2, 1, true, 0, false}, // 2 - T, T, F, P(F)
                {2, 1, false, 0, true}, // 4 - T, F, F, P(T)
                {1, 2, true, 1, false}  // 5 - F, T, T, P(F)
        });
    }

    @BeforeEach
    public void init() {
        vacationPlans = new VacationPlans();
        person = new Person();
        vacationDates = new VacationDates();
    }

    @ParameterizedTest
    @MethodSource("testSource")
    public void testCanGoOnVacation(Integer moneySaved, Integer moneyNeeded, Boolean datesAreWorkingDays, Integer canUseVacationDays, Boolean expectedResult) {
        person.setMoneySaved(moneySaved);
        person.setMoneyNeeded(moneyNeeded);
        person.setCanUseVacationDays(canUseVacationDays);
        vacationDates.setDatesAreWorkingDays(datesAreWorkingDays);

        assertEquals(expectedResult, vacationPlans.canGoOnVacation(person, vacationDates));
    }
}
