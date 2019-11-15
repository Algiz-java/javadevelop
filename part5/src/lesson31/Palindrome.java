package lesson31;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Print your word for check: ");
        String str = in.nextLine();
        System.out.print("First way: ");
        buildString(str);
        System.out.print("Second way: ");
        chrString(str);
    }

    private static void chrString(String str) {
        char[] chars = str.toCharArray();
        char[] reverseStr = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reverseStr[(chars.length - 1) - i] = chars[i];
        }
        if (str.equalsIgnoreCase(String.valueOf(reverseStr))){
             System.out.println("Palindrome - true, result: " + String.valueOf(reverseStr));
        }else System.out.println("Palindrome - false, result: " + String.valueOf(reverseStr));
    }

    private static void buildString(String str) {
        StringBuilder builder = new StringBuilder(str);
        String reverseStr =builder.reverse().toString();
        if (str.equalsIgnoreCase(reverseStr)) {
            System.out.println("Palindrome - true, result: " + builder);
        }else System.out.println("Palindrome - false, result: " + builder);
    }
}