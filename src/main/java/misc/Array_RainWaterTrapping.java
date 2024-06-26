package misc;

public class Array_RainWaterTrapping {

    public static void main(String[] args) {
        int[] array = new int[]{3,1,2,4,0,1,3,2};
        System.out.println("Water Trapped = "+ calculateTrappedWater(array));
    }

    public static int calculateTrappedWater(int[] array) {
        int[] left = new int[array.length];
        int[] right = new int[array.length];

        left[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            left[i] = Math.max(left[i - 1], array[i]);
        }

        right[array.length - 1] = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], array[i]);
        }

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + (Math.min(left[i], right[i]) - array[i]);
        }
        return total;
    }

}
