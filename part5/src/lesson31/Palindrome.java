package lesson31;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Print your word for check: ");
        String str = in.nextLine();
        System.out.print("First way: ");
        System.out.println("It's palindrome? - " + isPalindrome2(str));
        System.out.print("Second way: ");
        System.out.print("It's palindrome? - " + isPalindrome1(str));
    }

    private static boolean isPalindrome1(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i- 1])
                return false;
        }
        return true;
    }

    private static boolean isPalindrome2(String str) {
        StringBuilder builder = new StringBuilder(str);
        String reverseStr = builder.reverse().toString();
        return str.equalsIgnoreCase(reverseStr);
    }
}