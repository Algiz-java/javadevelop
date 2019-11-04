package lesson27;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество элементов ряда Фибоначи: ");
        int n = sc.nextInt();

        //Вывод на консоль результатов метода итерации
        System.out.println("Метод итерации:");
        iteration(n);
        System.out.print("\n" + Arrays.toString(iterationArray(n)) + " ");//Как вывести красиво на консоль без скобок?

        //Вывод на консоль результатов метода рекурсии
        System.out.println("\n" + "Метод рекурсии:");
        for (int i = 0; i < n; i++) {
            System.out.print(recursion(i) + " ");
        }
    }

    //Метод итерации, способ 1
    private static void iteration(int n) {
        long x = 0, y = 1, z;
        System.out.print(x + " " + y + " ");
        for (int i = 3; i <= n; i++) {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;
        }
    }

    //Метод итерации, способ 2
    private static long[] iterationArray(int n) {
        long[] iter = new long[n];
        iter[0] = 0;
        iter[1] = 1;
        for (int i = 2; i < n; ++i) {
            iter[i] = iter[i - 1] + iter[i - 2];
        }
        return iter;
    }

    //Метод рекурсии
    private static long recursion(int n) {
        int[] recurs = new int[n + 1];
        if (n == 0) {
            return recurs[0] = 0;
        }
        if (n == 1) {
            return recurs[1] = 1;
        }
        return recurs[n] = (int) (recursion(n - 1) + recursion(n - 2));
    }
}
