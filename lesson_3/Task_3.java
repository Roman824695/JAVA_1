//3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
// Нельзя положить в ArrayList<String> целое число. Лекция №3 27:30.
/* */
package lesson_3;
import java.util.ArrayList;
import java.util.Random;


public class Task_3 {
  

   
    
  
    public static void main(String[] args) {
     
        String [] str = {"Привет","как","дела" ,"чем","занят"};
        Random rnd = new Random();

        ArrayList<Object> list1 = new ArrayList<Object>();

        int j = 0;
          for (int i = 0; i < 10; i++) {
           int val = rnd.nextInt(0, 100);
          if(i%2==0)
            {
                list1.add(String.valueOf(str[j]));
                j++;
            }else{
              list1.add(Integer.valueOf(val));
            }
            
        }
        System.out.println(list1); 

        
        for(int y =0; y<list1.size();y++){
          Object num = list1.get(y);
          if(num instanceof Integer){
            list1.remove(num);
          }


        }


        System.out.println(list1); 
          
        }
        
        

       
       

            } 
        

            



