package lesson30;

import java.util.*;

public class SearchFirst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String str = in.nextLine();
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                set.remove(c);
            }
        }
        try {
            Object[] chars = set.toArray();
            System.out.println("Первый неповторяющийся символ - " + chars[0]);
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Все символы повторяются");
        }
    }
}
