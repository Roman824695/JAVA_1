/*
2.Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
*/
package lesson_4;


import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task_2 {
        public static void main(String[] args) {
        Random random = new Random();
        List<Integer> rndLL = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            rndLL.add(random.nextInt(1, 100));
        }

        System.out.println("Случайный LinkedList: " + rndLL);

        List<Integer> reversLL = new LinkedList<>();

        for (int i = rndLL.size() - 1; i >= 0; i--) {
            reversLL.add(rndLL.get(i));
        }

        System.out.println("Перевёрнутый LinkedList: " + reversLL);
    }
}