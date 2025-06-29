/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz2;

/**
 *
 * @author artem
 */
public class MatrixData {
    public int[][] matrix;
    public int rows;
    public int cols;

    public MatrixData(int n, int m) {
        rows = n;
        cols = m;
        matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int)(Math.random() * 100); // от 0 до 99
            }
        }
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
