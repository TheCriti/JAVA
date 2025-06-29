/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz9;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarData {
    private int year;
    private int month;

    public CalendarData(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDaysInMonth() {
        return LocalDate.of(year, month, 1).lengthOfMonth();
    }

    public int getStartDayOfWeek() {
        return LocalDate.of(year, month, 1).getDayOfWeek().getValue(); // 1 = Monday
    }

    public String getMonthName() {
        return LocalDate.of(year, month, 1)
                .getMonth()
                .getDisplayName(TextStyle.FULL, new Locale("ru"));
    }
}