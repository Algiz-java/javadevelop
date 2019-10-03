package lesson13;

import java.util.Random;

public class Mother{

    public static void main(String[] args) {
        String[] allFood = {"яблоко", "апельсин", "кашу", "мандарин", "банан", "суп", "помидор", "лук", "перец", "чипсы"};
        Random i = new Random();
        String newFood = allFood[i.nextInt(9)];
        System.out.println("Покушай " + newFood);
        Child child = new Child();
        child.food = newFood;
        child.eat();
    }
}
