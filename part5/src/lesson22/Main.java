package lesson22;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Random random = new Random();
        personList.add(new Person("Альбина", random.nextInt(99)));
        personList.add(new Person("Альберт", random.nextInt(99)));
        personList.add(new Person("Ксения", random.nextInt(99)));
        personList.add(new Person("Альберт", random.nextInt(99)));
        personList.add(new Person("Камиль", random.nextInt(99)));
        personList.add(new Person("Олег", random.nextInt(99)));
        personList.add(new Person("Элия", random.nextInt(99)));
        personList.add(new Person("Олег", random.nextInt(99)));
        personList.add(new Person("Татьяна", random.nextInt(99)));

        System.out.println("Первоначальный список");
        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        System.out.println("Список после сортировки");
        personList.sort(new SuperPersonComparator());
        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
