package lesson17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Books books = new Books();
        File file = new File("file.txt");
        if (!file.exists()){
            System.out.println("Библиотека пуста :(");
                System.out.print("Введите команду:" + "\n" + "1 - Сформировать автоматически"
                        + "\n" + "2 - Добавить книгу в ручную" + "\n" + "3 - Выйти из программы" + "\n");
                switch (in.nextInt()) {
                    case 1:
                        books.saveBooks();
                        break;
                    case 2:
                        books.createBooks();
                        books.addBook();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Не правильный ввод");
                }
        }
        while (true) {
            System.out.print("Введите команду:" + "\n" + "1 - Показать список" + "\n" + "2 - Добавить книгу"
                    + "\n" + "3 - Взять книгу" + "\n" + "4 - Выйти из программы" + "\n");
            switch (in.nextInt()) {
                case 1:
                    books.printBooks();
                    break;
                case 2:
                    books.addBook();
                    break;
                case 3:
                    books.deleteBook();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Не правильный ввод");
            }
        }
    }
}
