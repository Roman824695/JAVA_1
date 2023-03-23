// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2.Создать множество ноутбуков (ArrayList).
// 3.Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//  Выводить только те ноутбуки, что соответствуют условию


package Lesson_6;
import java.util.List;
import java.util.Scanner;
public class Task_1 {

 
    public static void main(String[] args) {
        Notebook mac13 = new Notebook("Mac", "13", "silver", "8", "256");
        Notebook mac14 = new Notebook("Mac", "13", "red", "16", "128");
        Notebook mac15 = new Notebook("Mac", "13", "green", "8", "256");
        Notebook sam = new Notebook("Sam", "note", "black", "32", "512");
        Notebook asu = new Notebook("Asu", "pupuv", "silver", "8", "256");
        Notebook xia = new Notebook("Xiaomi", "Mi", "black", "16", "128");


        List<Notebook> notebookList = List.of(mac13, mac14 , mac15, sam, asu, xia);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n 1 - по цвету.\n 2 - по бренду.\n 3 - по модели.\n 4 - по оперативной памяти.\n 5 - по жесткому диску.");
        int inputUser = scannerUser.nextInt();
        Scanner scannerUser2 = new Scanner(System.in);
       
        switch(inputUser){
    case 1:{
          System.out.println("Напишите интересующий цвет: ");
          String inputUser2 = scannerUser2.nextLine();
              for (Notebook color : notebookList) {
                  if (color.getColor().equalsIgnoreCase(inputUser2)) {
                  System.out.println(color.printInfo());
                  System.out.println();
                   }
              }
           }

    case 2:{
        System.out.println("Напишите интересующий бренд: ");
            String inputUser2 = scannerUser2.nextLine();
                for (Notebook brand : notebookList) {
                    if (brand.getBrand().equalsIgnoreCase(inputUser2)) {
                        System.out.println(brand.printInfo());
                        System.out.println();
                    }
                 }
          }
    case 3:{
        System.out.println("Напишите интересующую модель: ");
            String inputUser2 = scannerUser2.nextLine();
                for (Notebook model : notebookList) {
                    if (model.getModel().equalsIgnoreCase(inputUser2)) {
                        System.out.println(model.printInfo());
                        System.out.println();
                     }
                 }

            }
    case 4:{
        System.out.println("Напишите интересующий обьем оперативной памяти : ");
            String inputUser2 = scannerUser2.nextLine();
                for (Notebook ram : notebookList) {
                    if (ram.getRam().equalsIgnoreCase(inputUser2)) {
                        System.out.println(ram.printInfo());
                        System.out.println();
                     }
                 }

    } 
    
    case 5:{
        System.out.println("Напишите интересующий обьем жесткого диска: ");
            String inputUser2 = scannerUser2.nextLine();
                for (Notebook rom : notebookList) {
                    if (rom.getRom().equalsIgnoreCase(inputUser2)) {
                        System.out.println(rom.printInfo());
                        System.out.println();
                     }
                 }


    }

       

        }
}
    }
