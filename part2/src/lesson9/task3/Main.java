package lesson9.task3;

public class Main {
    public static void main(String[] args) {
        Mike mike = new Mike();
        mike.forward();
        mike.stop();//Как вывести в консоль метод stop интерфейса Run???
        Swim.lake();
        Niki niki = new Niki();
        Run.back();
        niki.ocean();
    }
}
