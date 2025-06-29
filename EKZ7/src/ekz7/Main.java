/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekz7;

import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = 0;
        int choice = 0;

        while (true) {
            System.out.print("Введите радиус окружности: ");
            if (in.hasNextDouble()) {
                radius = in.nextDouble();
                if (radius > 0) break;
                else System.out.println("Радиус должен быть положительным.");
            } else {
                System.out.println("Введите число.");
                in.next();
            }
        }

        while (true) {
            System.out.print("Выберите действие (1 - площадь, 2 - длина): ");
            if (in.hasNextInt()) {
                choice = in.nextInt();
                if (choice == 1 || choice == 2) break;
                else System.out.println("Введите 1 или 2.");
            } else {
                System.out.println("Введите целое число.");
                in.next();
            }
        }

        CircleData circle = new CircleData(radius);
        double r = circle.getRadius();
        double result;

        if (choice == 1) {
            result = CircleUtils.calcArea(r);
        } else {
            result = CircleUtils.calcLength(r);
        }

        String output = (choice == 1 ? "Площадь" : "Длина") +
                        " окружности радиуса " + r + " = " +
                        String.format("%.2f", result);

        JOptionPane.showMessageDialog(null, output);
    }
}