// 1. Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение).
package lesson_2;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для проверки : -> ");
        String num = sc.next();
        
        System.out.println();
        //System.out.print(num);
        //String str = "abc";
        //System.out.println(str.charAt(0));
        int j = num.length();
        int sum = 0;

    
    for (int i = 0;  i < num.length(); i++) {
        j--;
        if(num.charAt(i) == num.charAt(j)){
         sum++;
            }
        
    
    
    }
    if(sum == num.length()){
        
    System.out.printf(" >> " + num + " << является палиндромом");
    }else{
        System.out.printf(" >> " + num + " << не является палиндромом");

    }
        }
    }



    
    

