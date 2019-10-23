package lesson8.task4;

import java.util.Arrays;

class Convert {
    static void convert(Contract contract){
        Act result = new Act();
        result.setDate(contract.getDate());
        result.setNumb(contract.getNumb());
        result.setTovar(contract.getTovar());
        System.out.println("Акт номер: " + result.getNumb());
        System.out.println("Дата: " + result.getDate());
        System.out.println("Объекты: " + Arrays.toString(result.getTovar()));
    }
}