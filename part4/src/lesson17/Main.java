package lesson17;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Library library = new Library();
        File file = new File("file.txt");
        if (!file.exists()){
            System.out.println("Библиотека пуста :(");
                System.out.print("Введите команду:" + "\n" + "1 - Сформировать автоматически"
                        + "\n" + "2 - Добавить книгу в ручную" + "\n" + "3 - Выйти из программы" + "\n");
                switch (in.nextInt()) {
                    case 1:
                        library.automaticlyLibrary();
                        break;
                    case 2:
                        library.createBooks();
                        library.addBook();
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
                    library.printLibrary();
                    break;
                case 2:
                    library.addBook();
                    break;
                case 3:
                    library.deleteBook();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Не правильный ввод");
            }
        }
    }
}
