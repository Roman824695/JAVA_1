/*  
1.Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.  
*/

package lesson_4;

import java.util.LinkedList;
import java.util.Scanner;



public class Task_1 {
      public static void main(String[] args) {
        LinkedList<String> inputLL = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String srtAdd;
        System.out.println("Введите  строку.\n Для выхода используйте 'print'");

        while (!(srtAdd = scanner.nextLine()).equals("print"))
            inputLL.addFirst(srtAdd);
        scanner.close();
        System.out.println(inputLL);
    }
    }