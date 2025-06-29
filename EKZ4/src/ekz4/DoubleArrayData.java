/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz4;

/**
 *
 * @author artem
 */
public class DoubleArrayData {
    public double[] array;

    public DoubleArrayData(int size, double min, double max) {
        array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = min + Math.random() * (max - min);
        }
    }

    public double[] getArray() {
        return array;
    }
}