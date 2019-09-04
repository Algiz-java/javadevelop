import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean count = true;
        while (count) {
            System.out.print("Введите тип бензина АИ - ");
            int num = in.nextInt(); //Тип бензина (АИ-80, 92, 95)
            if (num != 80 & num != 92 & num != 95) {
                System.out.println("Неправильный ввод, введите 80, 92 или 95");
            }
            if (num == 80 | num == 92 | num == 95) {
                System.out.print("Введите количество литров - ");
                int val = in.nextInt(); //Количество литров
                double a = 40.3, b = 43.5, c = 45.6, x; //объявление переменных с ценой и конечная стоимость
                if (num == 80) {
                    x = a * val;
                    System.out.println("Стоимость бензина = " + x + " руб.");
                }
                if (num == 92) {
                    x = b * val;
                    System.out.println("Стоимость бензина = " + x + " руб.");
                }
                if (num == 95) {
                    x = c * val;
                    System.out.println("Стоимость бензина = " + x + " руб.");
                }
                count = false;
            }
        }
    }
}
