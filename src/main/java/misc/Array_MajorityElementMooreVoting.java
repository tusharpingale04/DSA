package misc;

public class Array_MajorityElementMooreVoting {

    public static void main(String[] args) {
        int[] array = new int[]{1,1,2,3,1};
        System.out.println("Majority Element: "+findMajorityElement(array));
    }

    public static int findMajorityElement(int[] array) {
        int majorityElementIdx = 0;
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[majorityElementIdx] == array[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                majorityElementIdx = i;
                count = 1;
            }
        }
        int majorityElementCount = 0;
        for (int i =0; i < array.length; i++) {
            if (array[majorityElementIdx] == array[i]) {
                majorityElementCount++;
            }
        }
        if (majorityElementCount > array.length / 2) return array[majorityElementIdx];
        return -1;
    }
}
