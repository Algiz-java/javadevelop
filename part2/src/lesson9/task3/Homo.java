package lesson9.task3;

abstract class Homo implements Run, Swim {

    @Override
    public void forward() {
        System.out.println("I'm running in forward");
    }

    @Override
    public void stop() {

    }

    @Override
    public void ocean() {
        System.out.println("I'm swimming in ocean");
    }

}
