package lesson9.task1;

import lesson9.task2.Fly;
import lesson9.task2.ICan;

class Fish extends Animal implements Fly {

    private ICan iCan = new ICan();
    @Override
    void getName() {
        System.out.println("My name is Fish");
    }

    @Override
    public void fly() {
        iCan.swim();
    }
}
