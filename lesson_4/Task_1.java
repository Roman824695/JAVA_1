/*  
1.Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.  
Если введено revert, удаляет предыдущую введенную строку из памяти.
*/

package lesson_4;

import java.util.LinkedList;
import java.util.Scanner;



public class Task_1 {
      public static void main(String[] args) {
        LinkedList<String> inputLL = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String strAdd;
        System.out.println("Введите  строку.\n Для выхода используйте 'print'");
        

        while (!(strAdd = scanner.nextLine()).equals("print")){
            
            if(strAdd.equals("revert")){
                inputLL.remove(inputLL.get(0));
            }else{
                inputLL.addFirst(strAdd);
        }
        }
        
        System.out.println(inputLL);
    }
    }