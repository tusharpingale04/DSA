package misc;

public class Array_PascalTriangle {

    public static void main(String[] args) {
        int n = 5;
        int r = 3;
        int number = findNumberInPascalTriangle(n-1, r-1);
        System.out.println("Number in pascal triangle is: "+ number);

        System.out.println();

        printPascalTriangleRow(5);
    }

    public static int findNumberInPascalTriangle(int row, int col) {
        int result = 1;
        for (int i = 0; i < row; i++) {
            result = result * (col - i);
            result = result / (i + 1);
        }
        return result;
    }

    public static void printPascalTriangleRow(int n) {
        int ans = 1;
        System.out.println(ans);
        for (int i=1; i<n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            System.out.println(ans);
        }
    }

    public static void printPascalTriangle(int n) {

    }
}
