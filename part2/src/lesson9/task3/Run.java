package lesson9.task3;

public interface Run {
    void forward();
    default void stop(){
        System.out.println("I'm stoped");
    }
    static void back(){
        System.out.println("I'm running in back");
    }
}
