//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
package lesson_2;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task_2 {
    public static void main(String[] arge){
        StringBuilder text = new StringBuilder();
                for (int i = 0; i < 100; i++) {
                        text.append("TEST");
        
        }
        
        
        System.out.println(text);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

            fileOutputStream.write(text.toString().getBytes());

            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("Проблема вывода!");
            e.printStackTrace();


    }
    
}
}
