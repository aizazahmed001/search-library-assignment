package test.java.search;

public class LinearSearch {
    public int search(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1; // Not found
    }
}