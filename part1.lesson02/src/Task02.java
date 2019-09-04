import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print("Введите вашу ЗП до вычета налога НДФЛ: ");
            int num = in.nextInt();
            float x;
            x = (float) (num - (num * 0.13));
            System.out.println("Ваша ЗП с вычетом НДФЛ 13% = " + x + " руб.");
        }
}
