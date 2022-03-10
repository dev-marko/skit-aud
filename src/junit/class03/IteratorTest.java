package junit.class03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

/**
 * The trhee methods tested are: hasNext(), next(), remove()
 * The following characteristics have been identified and are used to generate tests for the methods:
 * C1: iterator has more values
 * C2: iterator returns a non-null object reference
 * C3: remove() is supported
 * C4: remove() precondition is satisfied
 * C5: collection in consistent state while iterator in use
 * Each characteristic has a boolean partition
 */

public class IteratorTest {

    private List<String> list;          // test fixture
    private Iterator<String> iterator;  // test fixture

    @BeforeEach
    public void init() {
        list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        iterator = list.iterator();
    }

    // 3 Tests for Iterator method hasNext()
    // The 2 characteristics associated with hasNext() are: C1, C5

    // Test 1 of hasNext(): textHasNext_BaseCase(): C1-T, C5-T
    @Test
    public void testHasNext_BaseCase() {
        assertTrue(iterator.hasNext());
    }

    // Test 2 of hasNext(): testHasNext_C1(): C1-F, C5-T
    @Test
    public void testHasNext_C1() {
        iterator.next();
        iterator.next();        // consume the cat and the dog
        assertFalse(iterator.hasNext()); // now empty
    }

    // Test 3 of hasNext(): testHasNext_C5(): C1-T, C5-F
    // This test fails!
    // The reason is that standard Java implementations of the Iterator
    // interface are not consistent in their use of ConcurrentModificationException.
    @Test(expected = ConcurrentModificationException.class)
    public void testHasNext_C5() {
        list.add("elephant");
        iterator.hasNext();
    }

    // 4 Tests for Iterator method next()
    // The 3 characteristics associated with next() are: C1, C2, C5

    // Test 1 of next(): testNext_BaseCase(): C1-T, C2-T, C5-T
    @Test public void testNext_BaseCase()
    {
        assertEquals ("cat", iterator.next());
    }

    // Test 2 of next(): testNext_C1(): C1-F, C2-F, C5-T
    @Test(expected= NoSuchElementException.class)
    public void testNext_C1()
    {
        iterator.next(); iterator.next();        // consume the cat and the dog
        iterator.next();                    // now empty
    }

    // Test 3 of next(): testNext_C2(): C1-T, C2-F, C5-T
    @Test public void testNext_C2()
    {
        list = new ArrayList<String>();
        list.add (null);
        iterator = list.iterator();
        assertNull (iterator.next());
    }

    // Test 4 of next(): testNext_C5(): C1-T, C2-F, C5-F
    @Test(expected=ConcurrentModificationException.class)
    public void testNext_C5()
    {
        list.add ("elephant");
        iterator.next();
    }


    // 6 Tests for Iterator method remove()
    // The 5 characteristics associated with remove() are: C1, C2, C3, C4, C5

    // Test 1 of remove(): testRemove_BaseCase(): C1-T, C2-T, C3-T, C4-T, C5-T
    @Test public void testRemove_BaseCase()
    {
        iterator.next();
        iterator.remove();
        assertFalse (list.contains ("cat"));
    }

    // Test 2 of remove(): testRemove_C1(): C1-F, C2-F, C3-T, C4-T, C5-T
    @Test public void testRemove_C1()
    {
        iterator.next(); iterator.next();        // consume the cat and the dog
        iterator.remove();                  // remove dog from list.
        assertFalse (list.contains ("dog"));
    }

    // Test 3 of remove(): testRemove_C2(): C1-T, C2-F, C3-T, C4-T, C5-T
    @Test public void testRemove_C2()
    {
        list.add (null);
        list.add ("elephant");
        iterator = list.iterator();
        iterator.next(); iterator.next();        // consume the cat and the dog
        iterator.next();        // consume null; iterator not empty
        iterator.remove();      // remove null from list
        assertFalse (list.contains (null));
    }

    // Test 4 of remove(): testRemove_C3(): C1-T, C2-T, C3-F, C4-T, C5-T
    @Test(expected=UnsupportedOperationException.class)
    public void testRemove_C3()
    {
        list = Collections.unmodifiableList (list);
        iterator = list.iterator();
        iterator.next();   // consume first element to make C4 true
        iterator.remove();
    }

    // Test 5 of remove(): testRemove_C4(): C1-T, C2-T, C3-T, C4-F, C5-T
    @Test (expected=IllegalStateException.class)
    public void testRemove_C4()
    {
        iterator.remove();
    }


    // Test 6 of next(): testRemove_C5(): C1-T, C2-T, C3-T, C4-T, C5-F
    @Test (expected=ConcurrentModificationException.class)
    public void testRemove_C5()
    {
        iterator.next();
        list.add ("elephant");
        iterator.remove();
    }
}
