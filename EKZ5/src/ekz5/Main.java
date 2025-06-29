/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekz5;

import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        double x = 0, y = 0;

        while (true) {
            System.out.print("Введите размер массивов: ");
            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n > 0) break;
                else System.out.println("Размер должен быть больше 0.");
            } else {
                System.out.println("Введите целое число.");
                in.next();
            }
        }

        while (true) {
            System.out.print("Введите левую границу диапазона (x): ");
            if (in.hasNextDouble()) {
                x = in.nextDouble();
                break;
            } else {
                System.out.println("Введите число.");
                in.next();
            }
        }

        while (true) {
            System.out.print("Введите правую границу диапазона (y): ");
            if (in.hasNextDouble()) {
                y = in.nextDouble();
                if (y > x) break;
                else System.out.println("Правая граница должна быть больше левой.");
            } else {
                System.out.println("Введите число.");
                in.next();
            }
        }

        DoubleArrayPair data = new DoubleArrayPair(n, x, y);
        double[] a = data.getArray1();
        double[] b = data.getArray2();
        double[] c = ArraySumUtils.pairwiseSum(a, b);

        String output = "Массив A:\n" + ArraySumUtils.format(a)
                      + "\nМассив B:\n" + ArraySumUtils.format(b)
                      + "\nСумма (A + B):\n" + ArraySumUtils.format(c);

        JOptionPane.showMessageDialog(null, output);
    }
}
