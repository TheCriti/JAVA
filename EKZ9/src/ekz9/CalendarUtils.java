/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ekz9;

public class CalendarUtils {

    public static String buildCalendar(CalendarData data) {
        StringBuilder sb = new StringBuilder();
        sb.append("Календарь на ").append(data.getMonthName())
          .append(" ").append(data.getYear()).append("\n");
        sb.append("Пн Вт Ср Чт Пт Сб Вс\n");

        int firstDay = data.getStartDayOfWeek();
        int totalDays = data.getDaysInMonth();

        // Смещение для начала месяца
        for (int i = 1; i < firstDay; i++) {
            sb.append("   ");
        }

        for (int day = 1; day <= totalDays; day++) {
            sb.append(String.format("%2d ", day));
            if ((day + firstDay - 1) % 7 == 0) sb.append("\n");
        }

        return sb.toString();
    }

    public static int parseMonth(String input) {
        input = input.trim().toLowerCase();
        switch (input) {
            case "янв.": return 1;
            case "фев.": return 2;
            case "мар.": return 3;
            case "апр.": return 4;
            case "май.": return 5;
            case "июн.": return 6;
            case "июл.": return 7;
            case "авг.": return 8;
            case "сен.": return 9;
            case "окт.": return 10;
            case "ноя.": return 11;
            case "дек.": return 12;
            default:
                try {
                    int num = Integer.parseInt(input);
                    if (num >= 1 && num <= 12) return num;
                } catch (NumberFormatException e) {
                    return -1;
                }
        }
        return -1;
    }
}