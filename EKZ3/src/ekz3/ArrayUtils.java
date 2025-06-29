/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz3;

/**
 *
 * @author artem
 */
public class ArrayUtils {
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static String format(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int val : arr) {
            sb.append(val).append(" ");
        }
        return sb.toString();
    }
}
