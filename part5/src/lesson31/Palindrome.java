package lesson31;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Print your word for check: ");
        String str = in.nextLine();
        System.out.print("First way: ");
        System.out.println("It's palindrome? - " + buildString(str));
        System.out.print("Second way: ");
        System.out.print("It's palindrome? - " + chrString(str));
    }

    //как корректно вывести результат этих методов и допустимо ли это вообще?
    private static boolean chrString(String str) {
        char[] chars = str.toCharArray();
        char[] reverseStr = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reverseStr[(chars.length - 1) - i] = chars[i];
        }
        return str.equalsIgnoreCase(String.valueOf(reverseStr));
    }

    private static boolean buildString(String str) {
        StringBuilder builder = new StringBuilder(str);
        String reverseStr = builder.reverse().toString();
        return str.equalsIgnoreCase(reverseStr);
    }
}