package search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InterpolationSearchTest {
    InterpolationSearch is = new InterpolationSearch();

    @Test
    public void testTargetFound() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(2, is.search(arr, 30));
    }

    @Test
    public void testTargetAtStart() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(0, is.search(arr, 10));
    }

    @Test
    public void testTargetAtEnd() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(4, is.search(arr, 50));
    }

    @Test
    public void testTargetNotFound() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(-1, is.search(arr, 25));
    }

    @Test
    public void testSingleElement_Found() {
        assertEquals(0, is.search(new int[]{15}, 15));
    }

    @Test
    public void testSingleElement_NotFound() {
        assertEquals(-1, is.search(new int[]{15}, 99));
    }

    @Test
    public void testOutOfRangeHigh() {
        int[] arr = {10, 20, 30};
        assertEquals(-1, is.search(arr, 100));
    }

    @Test
    public void testOutOfRangeLow() {
        int[] arr = {10, 20, 30};
        assertEquals(-1, is.search(arr, 1));
    }
}