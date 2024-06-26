package misc;

import java.util.Arrays;

public class Array_SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 6, 1, 7, 4, 2,};
        System.out.println("Sorted array: "+ Arrays.toString(selectionSort(array)));
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
