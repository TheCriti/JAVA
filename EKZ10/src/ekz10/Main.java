/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ekz10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Видеокарта", "Твердотельный накопитель", "Процессор", "Игровое кресло", "Монитор"};
        int[] amounts = {7, 12, 5, 3, 9};
        double[] prices = {132500.00, 28990.99, 84990.49, 44990.00, 55770.25};

        StockData stock = new StockData(names, amounts, prices);

        String input = JOptionPane.showInputDialog(
                "Введите название товара (например: Видеокарта, Процессор...)");

        if (input == null) return;

        int index = stock.findIndex(input.trim());

        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Товар не найден.");
        } else {
            int qty = stock.amounts[index];
            double price = stock.prices[index];
            double total = StockUtils.calcTotal(qty, price);

            String output = "Товар: " + stock.names[index] +
                    "\nКоличество: " + qty +
                    "\nЦена за штуку: " + StockUtils.format(price) +
                    "\nОбщая стоимость: " + StockUtils.format(total);

            JOptionPane.showMessageDialog(null, output);
        }
    }
}

