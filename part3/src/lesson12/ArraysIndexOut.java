package lesson12;

public class ArraysIndexOut {
    private int[] arrays = new int[5];
    int error(){
        return arrays[6];
    }
}
