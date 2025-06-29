/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz6;

/**
 *
 * @author artem
 */
public class MatrixCalcUtils {

    public static double[][] multiply(double[][] a, double[][] b) {
        int n = a.length;
        double[][] result = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += a[i][k] * b[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    public static String format(double[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (double[] row : matrix) {
            for (double val : row) {
                sb.append(String.format("%.2f", val)).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}