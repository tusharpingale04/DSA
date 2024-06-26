package misc;

public class Array_MarkZerosInMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 1, 1}
        };
        int[][] newMatrix = markZeros(matrix);
        int rows = newMatrix.length;
        int cols = newMatrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j= 0; j < cols; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] markZeros(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j= 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j= 0; j < cols; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

}
