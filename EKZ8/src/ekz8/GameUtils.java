/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz8;

/**
 *
 * @author artem
 */
public class GameUtils {

    public static String checkGuess(int guess, int secret) {
        if (guess == secret) return "Угадали!";
        else if (guess < secret) return "Больше";
        else return "Меньше";
    }
}