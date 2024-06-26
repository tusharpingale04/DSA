package misc;

import java.util.Arrays;

public class Array_BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 6, 1, 7, 4, 2,};
        System.out.println("Sorted array: "+ Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    var temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

}
