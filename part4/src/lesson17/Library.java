package lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Library {
    void createBooks() throws IOException {
        File file = new File("file.txt");
        file.createNewFile();
    }
    void automaticlyLibrary() {
        ArrayList<Object> s = new ArrayList<>();
        s.add("Шантарам, автор: Грегори Дэвид Робертс, год издания: 1973");
        s.add("Три товарища, автор: Эрих Мария Ремарк, год издания: 1905");
        s.add("Атлант расправил плечи, автор: Айн Рэнд, год издания: 1989");
        s.add("Над пропастью во ржи, автор: Джером Д. Сэлинджер, год издания: 1951");
        s.add("Война и мир, автор: Лев Толстой, год издания: 1869");
        s.add("Улисс, автор: Джеймс Джойс, год издания: 1922");
        s.add("Шум и ярость, автор: Уильям Фолкнер, год издания: 1929");
        s.add("Невидимка, автор: Ральф Эллисон, год издания: 1952");
        s.add("Гордость и предубеждение, автор: Джейн Остин, год издания: 1813");
        s.add("Путешествия Гулливера, автор: Джонатан Свифт, год издания: 1726");
        s.add("Распад, автор: Чинуа Ачебе, год издания: 1958");
        s.add("Гроздья гнева, автор: Джон Стейнбек, год издания: 1939");
        try (OutputStream os = new FileOutputStream("file.txt");
            PrintStream ps = new PrintStream(os)) {
            for (Object o : s) {
                ps.println(o);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void printLibrary() {
        try (InputStream is = new FileInputStream("file.txt");
             LineNumberReader isr = new LineNumberReader(new InputStreamReader(is))){
            String line;
            while ((line = isr.readLine()) != null) {
                System.out.println(isr.getLineNumber()+ ". " + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void addBook() {
        updateLibraryFile(1);
    }

    void deleteBook() {
        updateLibraryFile(2);
    }

    private void updateLibraryFile(int j) {
        Scanner in  = new Scanner(System.in);
        try (InputStream is = new FileInputStream("file.txt");
             LineNumberReader isr = new LineNumberReader(new InputStreamReader(is))){
            String line;
            List<String> list = new ArrayList<>();
            while ((line = isr.readLine()) !=null) {
                list.add(line);
            }
            if (j == 1 ) {
                System.out.println("Введите книгу в формате: название, автор, год издания:");
                list.add(in.nextLine());
            }else {
                while (true){
                    System.out.print("Введите номер книги которую хотите взять: ");
                    int sel = in.nextInt();
                    if (sel <= list.size()){
                        System.out.println("Вы выбрали: " + list.get(sel));
                        list.remove(sel - 1);
                        break;
                    }else{
                        System.out.println("Не правильнный ввод, введите цифру от 1 до " + (list.size()+1));
                    }
                }

            }
            try (OutputStream os = new FileOutputStream("file.txt");
                 PrintStream ps = new PrintStream(os)) {
                for (String s : list) {
                    ps.println(s);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
