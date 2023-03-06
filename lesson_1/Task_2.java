/** 2. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). 
 *  Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 * */
package lesson_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] arge) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ->");
        int num = sc.nextInt();

        if (num%4 == 0){
            if(num%100 ==0){
                if(num%400 ==0) {
                    System.out.println("Да");
             }else{
                System.out.println("нет");}

            }else{
                System.out.println("ДА");}
           
        }else{
            System.out.println("нет");}



    }
    
}
