/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekz3;

import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        while (true) {
            System.out.print("Введите размер массива: ");
            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n > 0) break;
                else System.out.println("Число должно быть больше 0.");
            } else {
                System.out.println("Введите целое число.");
                in.next();
            }
        }

        ArrayData data = new ArrayData(n);
        int[] original = data.getOriginal();
        int[] reversed = ArrayUtils.reverse(original);

        String output = "Исходный массив:\n" + ArrayUtils.format(original)
                      + "\nОбратный массив:\n" + ArrayUtils.format(reversed);

        JOptionPane.showMessageDialog(null, output);
    }
}
