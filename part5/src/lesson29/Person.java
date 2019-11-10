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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
