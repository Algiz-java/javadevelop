package lesson25.task2;

import java.util.*;

class Unique {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Вася", "Иванов");
        map.put("Петр", "Иванов");
        map.put("Виктор", "Петров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Петров");
        System.out.println(isUnique(map));
        map.clear();
        System.out.println(isUnique(map));
        map.put("Вася", "Иванов");
        map.put("Петр", "Сидоров");
        map.put("Виктор", "Петров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");
        System.out.println(isUnique(map));
    }

    private static boolean isUnique(Map<String, String> map) {
        boolean result = true;
        int count = 0;
        if (!map.isEmpty()) {
            String[] word = map.values().toArray(new String[0]);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                for (String s : word) {
                    if (s.equals(entry.getValue())) {
                        count++;
                    }
                }
            }
            if (count >= word.length + 4) {
                System.out.print("в мапе более двух одинаковых value, метод возрващает: ");
                result = false;
            } else {
                System.out.print("в мапе менее двух одинаковых value, метод возрващает: ");
            }
        } else {
            System.out.print("в мапе нет переменных, метод возрващает:  ");
        }
        return result;
    }
}