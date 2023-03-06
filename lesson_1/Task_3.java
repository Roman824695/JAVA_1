/** 3. Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
*/
package lesson_1;
import java.util.Scanner;
import java.util.Random;
public class Task_3 {
    public static void main(String[] arge){

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
    System.out.println();
    
    System.out.println("Введите число которое перенести в конец массива: -> ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();

    int[] myArray2;
        myArray2 = new int[myArray.length];
        int cont = 0; 
        int cos = 0;

    for(int i = 0; i < myArray.length; i++){
        if(myArray[i] != number){
            myArray2[cos] = myArray[i];
            cos++;
          
        }else{
            myArray2[(myArray2.length-1) - cont] = myArray[i];
            cont++;
           
        }
    }
    System.out.print("[ ");

    for( int i = 0; i < myArray2.length; i++){
        System.out.printf(myArray2[i]+ " ");
    }    
    System.out.print("]");




    
    
}  

}
