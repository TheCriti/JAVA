/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz2;

/**
 *
 * @author artem
 */
public class MatrixUtils {

    public static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int val : row) {
                if (val < min) min = val;
            }
        }
        return min;
    }

    public static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int val : row) {
                if (val > max) max = val;
            }
        }
        return max;
    }

    public static int[] rowSums(int[][] matrix) {
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }

    public static int[] colSums(int[][] matrix) {
        int cols = matrix[0].length;
        int[] sums = new int[cols];
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int[] ints : matrix) {
                sum += ints[j];
            }
            sums[j] = sum;
        }
        return sums;
    }
}
