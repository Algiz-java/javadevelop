package lesson19;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(new File("products.txt")).useLocale(Locale.ENGLISH)){
            scanner.useDelimiter("\n");
            System.out.println("Наименование        Цена     Кол-во   Стоимость");
            System.out.println("===============================================");
            float summa = 0;
            while (scanner.hasNext()) {
                String s = scanner.next();
                Float i = scanner.nextFloat();
                Float f = scanner.nextFloat();
                String v = String.format(Locale.US, "%-19s %-6.2f x %-9.3f =%7.2f\n", s, f, i, f*i);
                summa += f*i;
                System.out.print(v);
            }
            System.out.println("===============================================");
            System.out.printf("%s %40.2f","Итого:",summa);
        }
    }
}
