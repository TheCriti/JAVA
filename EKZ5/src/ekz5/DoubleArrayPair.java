/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz5;

/**
 *
 * @author artem
 */
public class DoubleArrayPair {
    public double[] array1;
    public double[] array2;

    public DoubleArrayPair(int size, double min, double max) {
        array1 = new double[size];
        array2 = new double[size];
        for (int i = 0; i < size; i++) {
            array1[i] = min + Math.random() * (max - min);
            array2[i] = min + Math.random() * (max - min);
        }
    }

    public double[] getArray1() {
        return array1;
    }

    public double[] getArray2() {
        return array2;
    }
}