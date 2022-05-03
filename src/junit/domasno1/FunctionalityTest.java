package junit.domasno1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The method being tested is commonElements()
 * The following characteristics have been identified and are used to generate tests for the method:
 * C1: there are common elements, a non-null list is returned
 * C2: the first parameter (list1) is an empty list
 * C3: the second parameter (list2) is an empty list
 * Each characteristic has a boolean partition
 */

public class FunctionalityTest {

    private List<String> list1;
    private List<String> list2;


    @Before
    public void init() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();

        list1.add("marko");
        list2.add("spasenovski");
    }

    // Test 1/4 of commonElements(): testCommonElements_BaseCase: C1=T, C2=F, C3=F
    // C1: there are common elements, a non-null list is returned
    // C2: the first parameter (list1) is an empty list
    // C3: the second parameter (list2) is an empty list
    @Test
    public void testCommonElements_BaseCase() {
        list2.add("marko");
        assertEquals(list1, CommonElements.commonElements(list1, list2));
    }

    // Test 2/4 of commonElements(): testCommonElements_Two: C1=F, C2=T, C3=T
    // C1: there are common elements, a non-null list is returned
    // C2: the first parameter (list1) is an empty list
    // C3: the second parameter (list2) is an empty list
    @Test
    public void testCommonElements_Two() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        assertNull(CommonElements.commonElements(list1, list2));
    }

    // Test 3/4 of commonElements(): testCommonElements_Three: C1=F, C2=T, C3=F
    // C1: there are common elements, a non-null list is returned
    // C2: the first parameter (list1) is an empty list
    // C3: the second parameter (list2) is an empty list
    @Test
    public void testCommonElements_Three() {
        list1 = new ArrayList<>();
        assertNull(CommonElements.commonElements(list1, list2));
    }

    // Test 4/4 of commonElements(): testCommonElements_Four: C1=F, C2=F, C3=T
    // C1: there are common elements, a non-null list is returned
    // C2: the first parameter (list1) is an empty list
    // C3: the second parameter (list2) is an empty list
    @Test
    public void testCommonElements_Four() {
        list2 = new ArrayList<>();
        assertNull(CommonElements.commonElements(list1, list2));
    }

}
