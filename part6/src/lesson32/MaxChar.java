package lesson32;

import java.util.*;

public class MaxChar {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Please, enter the string: ");
            String str = in.nextLine();

            try {
                Map<Character, Integer> map = new HashMap<>();
                for (int i = 0; i < str.length(); i++) {
                    Character charAt = str.charAt(i);
                    int count = 1;
                    if (map.containsKey(charAt)) {
                        count = map.get(charAt) + 1;
                    }
                    map.put(charAt, count);
                }
                System.out.println(map);

                int maxValue = (Collections.max(map.values()));

                if (maxValue > 1) {
                    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                        if (entry.getValue() == maxValue) {
                            System.out.println("Character: '" + entry.getKey() +
                                    "' has occurred maximum times in String: " + entry.getValue());
                        }
                    }
                } else System.out.println("String '" + str + "' don't have maximum times Character");
                break;

            } catch (NoSuchElementException ex) {
                System.out.println("ERROR!!! 'No string entered'");
            }
        }
    }
}