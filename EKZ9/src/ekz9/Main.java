/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekz9;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = -1;
        int year = 0;

        while (month == -1) {
            System.out.print("Введите месяц (1–12 или сокращённо, например «Мар.»): ");
            String input = in.next();
            month = CalendarUtils.parseMonth(input);
            if (month == -1) System.out.println("Неверный формат месяца.");
        }

        while (true) {
            System.out.print("Введите год (1900–2100): ");
            if (in.hasNextInt()) {
                year = in.nextInt();
                if (year >= 1900 && year <= 2100) break;
                else System.out.println("Год должен быть в пределах 1900–2100.");
            } else {
                System.out.println("Введите число.");
                in.next();
            }
        }

        CalendarData data = new CalendarData(month, year);
        String calendar = CalendarUtils.buildCalendar(data);
        JOptionPane.showMessageDialog(null, calendar);
    }
}
