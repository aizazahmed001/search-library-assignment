package search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {
    BinarySearch bs = new BinarySearch();

    // MC/DC: target found in middle
    @Test
    public void testTargetFoundInMiddle() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, bs.search(arr, 5));
    }

    // MC/DC: target found at beginning
    @Test
    public void testTargetFoundAtStart() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(0, bs.search(arr, 1));
    }

    // MC/DC: target found at end
    @Test
    public void testTargetFoundAtEnd() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(4, bs.search(arr, 9));
    }

    // MC/DC: target NOT in array (goes right)
    @Test
    public void testTargetNotFound_High() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, bs.search(arr, 10));
    }

    // MC/DC: target NOT in array (goes left)
    @Test
    public void testTargetNotFound_Low() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, bs.search(arr, 0));
    }

    // MC/DC: single element - found
    @Test
    public void testSingleElementFound() {
        int[] arr = {42};
        assertEquals(0, bs.search(arr, 42));
    }

    // MC/DC: single element - not found
    @Test
    public void testSingleElementNotFound() {
        int[] arr = {42};
        assertEquals(-1, bs.search(arr, 99));
    }

    // MC/DC: empty array
    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, bs.search(arr, 5));
    }
}