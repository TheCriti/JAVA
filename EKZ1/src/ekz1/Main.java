/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekz1;
import java.util.Scanner;

/**
 *
 * @author artem
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 0;
        int x = 0;

        // Ввод размера массива
        while (true) {
            System.out.print("Введите размер массива: ");
            if (in.hasNextInt()) {
                size = in.nextInt();
                if (size > 0) break;
                else System.out.println("Размер должен быть больше 0.");
            } else {
                System.out.println("Введите целое число.");
                in.next();
            }
        }

        // Ввод порога
        while (true) {
            System.out.print("Введите пороговое значение: ");
            if (in.hasNextInt()) {
                x = in.nextInt();
                break;
            } else {
                System.out.println("Введите целое число.");
                in.next();
            }
        }

        ArrayData array = new ArrayData(size);
        int[] arr = array.getArray();

        ArrayUtils.printArray(arr);
        ArrayUtils.printIndexesAbove(arr, x);
    }
}
