package lesson22;

class Person {
    private String name;
    private int age;

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
