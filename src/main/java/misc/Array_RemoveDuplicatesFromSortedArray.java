package misc;

import java.util.ArrayList;
import java.util.List;

public class Array_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 2, 2, 3, 3};
        List<Integer> uniqueArray = removeDuplicatesFromSortedArray(array);
        System.out.println("Unique array: " + uniqueArray);
    }

    public static List<Integer> removeDuplicatesFromSortedArray(int[] array) {
        if (array.length == 0) return new ArrayList<>();
        List<Integer> uniqueArray = new ArrayList<>();
        int current = array[0];
        uniqueArray.add(current);
        int i = 1;
        while (i <= array.length - 1) {
            if (current != array[i]) {
                current = array[i];
                uniqueArray.add(current);
            }
            i++;
        }
        return uniqueArray;
    }
}
