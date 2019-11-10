package lesson29;


import java.util.*;

public class PersonHashMap {

    public static void main(String[] args) {
        removeTheDuplicates(createMap());
    }

    private static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        Person person5 = new Person(30, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        book.put("Key7", person5);
        return book;
    }

    private static void removeTheDuplicates(Map<String, Person> map) {
        Set<Person> personSet = new HashSet<>();
        Set<Person> samePerson = new HashSet<>();
        for (Map.Entry<String, Person> personEntry : map.entrySet()) {
            Person value = personEntry.getValue();
            if (personSet.contains(value)) {
                samePerson.add(value);
            } else {
                personSet.add(value);
            }
        }
        for (Person person : samePerson) {
            removeItemFromMapByValue(map, person);
        }
        printHashMap(map);
    }

    private static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    private static void printHashMap(Map<String, Person> map) {
        for (Map.Entry<String, Person> stringPersonEntry : map.entrySet()) {
            System.out.println(stringPersonEntry.getKey() + " - " + stringPersonEntry.getValue().getAge() +
                    " " + stringPersonEntry.getValue().getName() + " " + stringPersonEntry.getValue().getMale());
        }
    }
}
