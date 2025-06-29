/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz3;

/**
 *
 * @author artem
 */
public class ArrayData {
    public int[] original;

    public ArrayData(int size) {
        original = new int[size];
        for (int i = 0; i < size; i++) {
            original[i] = (int)(Math.random() * 100); // числа от 0 до 99
        }
    }

    public int[] getOriginal() {
        return original;
    }
}
