/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz10;

/**
 *
 * @author artem
 */
public class StockUtils {

    public static double calcTotal(int count, double price) {
        return count * price;
    }

    public static String format(double value) {
        return String.format("%.2f", value);
    }
}