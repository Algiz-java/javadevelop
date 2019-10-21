package lesson19;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(new File("products.txt")).useLocale(Locale.ENGLISH)) {
            scanner.useDelimiter("\n");
            String s1 = "Наименование        Цена     Кол-во   Стоимость";
            String s2 = "===============================================";
            try (OutputStream os = new FileOutputStream("check.txt"); //Формирование файла с чеком
                 PrintStream ps = new PrintStream(os)) {
                ps.println(s1);
                ps.println(s2);
                System.out.println(s1);
                System.out.println(s2);
                float summa = 0;
                while (scanner.hasNext()) {
                    String s = scanner.next();
                    Float i = scanner.nextFloat();
                    Float f = scanner.nextFloat();
                    String v = String.format(Locale.US, "%-19s %-6.2f x %-9.3f =%7.2f\n", s, f, i, f * i);
                    summa += f * i;
                    System.out.print(v);
                    ps.print(v);
                }
                String v1 = String.format(Locale.US, "%s %40.2f", "Итого:", summa);
                ps.println(s2);
                ps.print(v1);
                System.out.println(s2);
                System.out.print(v1);
            }
        }
    }
}
