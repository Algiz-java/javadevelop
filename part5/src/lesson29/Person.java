package lesson29;

class Person {
    private String male;
    private String name;
    private int age;

    String getMale() {
        return male;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    Person(int age, String name, String male) {
        this.male = male;
        this.name = name;
        this.age = age;
    }
}
