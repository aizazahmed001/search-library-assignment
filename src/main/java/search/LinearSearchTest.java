package search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearSearchTest {
    LinearSearch ls = new LinearSearch();

    @Test
    public void testTargetFound() {
        int[] arr = {4, 2, 7, 1, 9};
        assertEquals(2, ls.search(arr, 7));
    }

    @Test
    public void testTargetAtStart() {
        int[] arr = {4, 2, 7, 1, 9};
        assertEquals(0, ls.search(arr, 4));
    }

    @Test
    public void testTargetAtEnd() {
        int[] arr = {4, 2, 7, 1, 9};
        assertEquals(4, ls.search(arr, 9));
    }

    @Test
    public void testTargetNotFound() {
        int[] arr = {4, 2, 7, 1, 9};
        assertEquals(-1, ls.search(arr, 99));
    }

    @Test
    public void testNullArray() {
        assertEquals(-1, ls.search(null, 5));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(-1, ls.search(new int[]{}, 5));
    }

    @Test
    public void testSingleElement_Found() {
        assertEquals(0, ls.search(new int[]{7}, 7));
    }

    @Test
    public void testSingleElement_NotFound() {
        assertEquals(-1, ls.search(new int[]{7}, 3));
    }
}