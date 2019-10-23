package lesson22;

import java.util.Comparator;

public class SuperPersonComparator implements Comparator<Person> {

    public int compare(Person value1, Person value2) {
        String name1 = value1.getName();
        String name2 = value2.getName();
        int compare = name1.compareTo(name2);

        if (compare != 0) {
            return compare;
        } else {
            Integer age1 = value1.getAge();
            Integer age2 = value2.getAge();
            return age1.compareTo(age2);
        }
    }
}
