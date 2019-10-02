package lesson12;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, World");

        //вызов ошибки NullPointerException:
        /*NullPointerException nullPointerException = new NullPointerException();
        nullPointerException.error();*/

        //вызов ошибки ArrayIndexOutOfBoundsException:
        /*ArraysIndexOut arraysIndexOut = new ArraysIndexOut();
        arraysIndexOut.error();*/

        //вызов своей ошибки через throws:
        /*MyError myError = new MyError();
        myError.error();*/
    }
}
