package lesson21.task1;

import java.util.Random;

public class ShiftArrays {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[4][10];
        printArrays(arr);
        toLeft(arr);
    }


    private static void printArrays(Integer[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(200);
                System.out.printf("%-3d ", arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    private static void toLeft(Integer[][] arr) {
        System.out.println("Массив с сдвигом влево:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i][j+1];
                System.out.printf("%-3d ", arr[i][j]);
            }
            System.out.print(arr[i][arr[i].length - 1] = 0);
            System.out.println(" ");
        }
    }
}
