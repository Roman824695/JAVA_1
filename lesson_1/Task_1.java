package lesson_1;

import java.util.Random;

public class Task_1 {
     public static void main(String[] arge) {

    int[] myArray;
    myArray = new int[10];
    System.out.print("[ ");
    for (int i = 0; i < myArray.length;i++ ) {
       
       double num = Math.random()*100;
       //double doubleValue = 0.0001;
       int value = (int) num;
       myArray[i] = value;
       System.out.printf(myArray[i]+ " ");
       
    
    }
    System.out.print("]");

    int max = myArray[0];
    int min = myArray[0];

    for (int i = 0; i < myArray.length;i++ )
        {
        if (myArray[i] > max)
        {
          max = myArray[i];
        }
        else if (myArray[i] < min)
        {
         min = myArray[i];
        }


    }
System.out.println();
System.out.printf("Минимальное число > " + min);
System.out.println();
System.out.printf("Максимальное число > " + max);


    

    }
    
}
