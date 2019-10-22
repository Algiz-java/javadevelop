package lesson21.task2;

import java.util.Random;

public class ReversArray {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[4][10];
        printArrays(arr);
        toLeft(arr);
    }


    private static void printArrays(Integer[][] arr) {
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ran.nextInt(200);
                System.out.printf("%-3d ", arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    private static void toLeft(Integer[][] arr) {
        System.out.println("Реверс массива:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length -1; j >= 0; j--) {
                arr[i][j] = arr[i][j];
                System.out.printf("%-3d ", arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
