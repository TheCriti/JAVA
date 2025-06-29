/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz10;

/**
 *
 * @author artem
 */
public class StockData {
    public String[] names;
    public int[] amounts;
    public double[] prices;

    public StockData(String[] names, int[] amounts, double[] prices) {
        this.names = names;
        this.amounts = amounts;
        this.prices = prices;
    }

    public int findIndex(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
}