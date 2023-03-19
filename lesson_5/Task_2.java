// 2. Пусть дан список сотрудников:
/*
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов 
*/
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package lesson_5;
import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        Map<String, Integer> name = new HashMap<>();
        String employees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] listName = employees.split(" ");
        for (int i = 0; i < listName.length; i += 2) {
            if (name.containsKey(listName[i])) {
                name.replace(listName[i], name.get(listName[i]) + 1);
            } else {
                name.put(listName[i], 1);
            }
        }



       
        Map<String, Integer> sortedName = new LinkedHashMap<>();
        int max = 1;
        for (int value : name.values()) {
            if (value > max) {
                max = value;
            }
          
        }



        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : name.entrySet()) {
                String key = entry.getKey();
                if (name.get(key) == i) {
                    sortedName.put(key, name.get(key));
                }
            }
        }
        System.out.println("\n" + sortedName + "\n");
    }
}




    



