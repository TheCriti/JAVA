/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekz8;

import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = 0, max = 0;

        while (true) {
            System.out.print("Введите нижнюю границу диапазона: ");
            if (in.hasNextInt()) {
                min = in.nextInt();
                break;
            } else {
                System.out.println("Введите целое число.");
                in.next();
            }
        }

        while (true) {
            System.out.print("Введите верхнюю границу диапазона: ");
            if (in.hasNextInt()) {
                max = in.nextInt();
                if (max > min) break;
                else System.out.println("Верхняя граница должна быть больше нижней.");
            } else {
                System.out.println("Введите целое число.");
                in.next();
            }
        }

        GuessGame game = new GuessGame(min, max);
        int secret = game.getSecret();

        while (true) {
            String input = JOptionPane.showInputDialog(
                "Угадайте число от " + min + " до " + max + 
                "\n(Для выхода введите: Сдаюсь!)");

            if (input == null || input.equalsIgnoreCase("Сдаюсь!")) {
                JOptionPane.showMessageDialog(null, "Вы сдались. Загаданное число было: " + secret);
                break;
            }

            try {
                int guess = Integer.parseInt(input);
                String result = GameUtils.checkGuess(guess, secret);
                if (result.equals("Угадали!")) {
                    JOptionPane.showMessageDialog(null, "Поздравляем! Вы угадали число: " + secret);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, result);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Введите целое число или 'Сдаюсь!'");
            }
        }
    }
}
