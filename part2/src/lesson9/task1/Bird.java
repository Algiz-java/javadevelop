package lesson9.task1;

import lesson9.task2.Fly;
import lesson9.task2.ICan;
import lesson9.task2.Run;
import lesson9.task2.Swim;

class Bird extends Animal implements Fly, Run, Swim {
    private ICan iCan = new ICan();

    @Override
    void getName() {
        System.out.println("My name is Bird");
    }

    @Override
    public void fly() {
        iCan.fly();
    }

    @Override
    public void run() {
        iCan.run();
    }

    @Override
    public void swim() {
        iCan.swim();
    }
}
