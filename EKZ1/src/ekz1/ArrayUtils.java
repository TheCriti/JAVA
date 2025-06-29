/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz1;

/**
 *
 * @author artem
 */
public class ArrayUtils {
    public static void printArray(int[] arr) {
        System.out.print("Массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printIndexesAbove(int[] arr, int threshold) {
        System.out.print("Индексы элементов больше " + threshold + ": ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > threshold) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
