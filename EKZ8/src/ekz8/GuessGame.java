/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz8;

/**
 *
 * @author artem
 */
public class GuessGame {
    private int secret;

    public GuessGame(int min, int max) {
        secret = min + (int)(Math.random() * (max - min + 1));
    }

    public int getSecret() {
        return secret;
    }
}