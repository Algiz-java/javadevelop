package lesson12;

class MyError {
    void error() {
        int a = 1;
        if (a != 2){
            throw new MyException("ошибка не равенства");
        }
    }
}
