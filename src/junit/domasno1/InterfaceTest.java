package junit.domasno1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The method being tested is commonElements()
 * The following characteristics have been identified and are used to generate tests for the method:
 * C1: the first parameter is not null
 * C2: the second parameter is not null
 * Each characteristic has a boolean partition
 */

public class InterfaceTest {

    private List<String> list1;
    private List<String> list2;


    @Before
    public void init() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();

        list1.add("marko");
        list2.add("spasenovski");
    }

    // Test 1 of commonElements(): testCommonElements_BaseCase: C1=T, C2=T
    // THIS TEST IS EXPECTED TO FAIL!!!
    // I couldn't make it work with assertDoesNotThrow()
    @Test()
    public void testCommonElements_BaseCase() {
        assertThrows(NullPointerException.class, () -> CommonElements.commonElements(list1, list2));
    }

    // Test 2 of commonElements(): testCommonElements_Param1IsNull: C1=F, C2=T
    @Test
    public void testCommonElements_Param1IsNull() {
        list1 = null;
        assertThrows(NullPointerException.class, () -> CommonElements.commonElements(list1, list2));
    }

    // Test 3 of commonElements(): testCommonElements_Param2IsNull: C1=T, C2=F
    @Test
    public void testCommonElements_Param2IsNull() {
        list2 = null;
        assertThrows(NullPointerException.class, () -> CommonElements.commonElements(list1, list2));
    }

}
