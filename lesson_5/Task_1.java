// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package lesson_5;
import java.util.HashMap;
import java.util.List;

public class Task_1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addPhoneBook();
        printPhoneBook("Роман");
        printPhoneBook("Дмитрий");
        printPhoneBook("Марина");
    }

    public static void addPhoneBook() {
        phoneBook.put("Роман", List.of("+7-956-987-26-63", "+7-956-987-73-90"));
        phoneBook.put("Дмитрий", List.of("+7-543-234-12-12", "+7-432-435-23-25"));
        phoneBook.put("Марина",List.of("+7-987-654-32-10", "+7-013-45-67-89"));

    }

    public static void printPhoneBook(String name) {
        System.out.printf("%s: %s", name, phoneBook.get(name)+ "\n");
    }
}











