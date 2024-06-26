package misc;

public class Array_MaximumSumSubArrayKadane {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, -2, 6, -1};
        System.out.println("Maximum sub array sum: " + maxSum(array));
    }

    public static int maxSum(int[] array) {
        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < array.length; i++) {
            currSum = currSum + array[i];
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

}
