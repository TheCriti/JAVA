/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz1;

/**
 *
 * @author artem
 */
public class ArrayData {
    public int[] numbers;

    public ArrayData(int size) {
        numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100); // от 0 до 99
        }
    }

    public int[] getArray() {
        return numbers;
    }
}