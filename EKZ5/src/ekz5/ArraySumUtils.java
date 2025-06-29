/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz5;

/**
 *
 * @author artem
 */
public class ArraySumUtils {

    public static double[] pairwiseSum(double[] a, double[] b) {
        int n = a.length;
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            result[i] = a[i] + b[i];
        }
        return result;
    }

    public static String format(double[] arr) {
        StringBuilder sb = new StringBuilder();
        for (double val : arr) {
            sb.append(String.format("%.2f", val)).append(" ");
        }
        return sb.toString();
    }
}