package misc;

import java.util.Arrays;

public class Array_InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 6, 1, 7, 4, 2,};
        System.out.println("Sorted array: "+ Arrays.toString(insertionSort(array)));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }

}
