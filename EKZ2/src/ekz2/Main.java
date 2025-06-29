/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekz2;

import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0, m = 0;

        // Ввод количества строк
        while (true) {
            System.out.print("Введите количество строк: ");
            if (in.hasNextInt()) {
                n = in.nextInt();
                if (n > 0) break;
                else System.out.println("Число должно быть положительным.");
            } else {
                System.out.println("Введите целое число.");
                in.next();
            }
        }

        // Ввод количества столбцов
        while (true) {
            System.out.print("Введите количество столбцов: ");
            if (in.hasNextInt()) {
                m = in.nextInt();
                if (m > 0) break;
                else System.out.println("Число должно быть положительным.");
            } else {
                System.out.println("Введите целое число.");
                in.next();
            }
        }

        MatrixData data = new MatrixData(n, m);
        int[][] matrix = data.getMatrix();

        int min = MatrixUtils.findMin(matrix);
        int max = MatrixUtils.findMax(matrix);
        int[] rowSums = MatrixUtils.rowSums(matrix);
        int[] colSums = MatrixUtils.colSums(matrix);

        StringBuilder output = new StringBuilder("Матрица:\n");
        for (int[] row : matrix) {
            for (int val : row) {
                output.append(String.format("%3d ", val));
            }
            output.append("\n");
        }

        output.append("\nМинимум: ").append(min);
        output.append("\nМаксимум: ").append(max);
        output.append("\nСуммы по строкам: ");
        for (int s : rowSums) output.append(s).append(" ");
        output.append("\nСуммы по столбцам: ");
        for (int s : colSums) output.append(s).append(" ");

        JOptionPane.showMessageDialog(null, output.toString());
    }
}

