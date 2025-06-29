/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz6;

/**
 *
 * @author artem
 */
public class MatrixPair {
    public double[][] matrixA;
    public double[][] matrixB;

    public MatrixPair(int n, double min, double max) {
        matrixA = new double[n][n];
        matrixB = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = min + Math.random() * (max - min);
                matrixB[i][j] = min + Math.random() * (max - min);
            }
        }
    }

    public double[][] getA() {
        return matrixA;
    }

    public double[][] getB() {
        return matrixB;
    }
}