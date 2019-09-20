package lesson8.task3;

class Count {

    private int count;

    Count(int count) {
        this.count = count;
    }
    void setCount(){
        int summa = count++;
        System.out.println(summa);
    }
}