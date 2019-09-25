package lesson9.task1;

import lesson9.task2.ICan;
import lesson9.task2.Run;

class Leo extends Animal implements Run {
    private ICan iCan = new ICan();
    @Override
    void getName() {
        System.out.println("My name is Leo");
    }

    @Override
    public void run() {
        iCan.run();
    }
}
