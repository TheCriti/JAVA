/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz4;

/**
 *
 * @author artem
 */
public class DoubleArrayUtils {

    public static double sum(double[] arr) {
        double total = 0;
        for (double val : arr) {
            total += val;
        }
        return total;
    }

    public static double average(double[] arr) {
        return sum(arr) / arr.length;
    }

    public static String format(double[] arr) {
        StringBuilder sb = new StringBuilder();
        for (double val : arr) {
            sb.append(String.format("%.2f", val)).append(" ");
        }
        return sb.toString();
    }
}