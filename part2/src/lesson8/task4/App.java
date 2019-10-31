package lesson8.task4;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Contract contract = new Contract();
        contract.setNumb();
        System.out.println("Договор номер: " + contract.getNumb());
        contract.setDate();
        System.out.println("Дата: " + contract.getDate());
        System.out.println("Акт номер: " + Convert.convertNumb(contract.getNumb()));
        System.out.println("Дата: " + Convert.convertDate(contract.getDate()));
        System.out.println("Объекты: " + Convert.convertTovar(Arrays.toString(contract.getTovar())));
    }
}