package lesson8.task4;


public class App {
    public static void main(String[] args) {
        Contract contract = new Contract();
        contract.setNumb();
        System.out.println("Договор номер: " + contract.getNumb());
        contract.setDate();
        System.out.println("Дата: " + contract.getDate());
        Convert.convert(contract);
    }
}