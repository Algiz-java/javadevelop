package lesson7;

import java.util.Scanner;

class Coffee {
    private String[][] sortCoffee = new String[4][4];
    String select;
    private Scanner in = new Scanner(System.in);
    private int[] priceCoffee = {50,48,11,55,56,78,45,40,30};
    int z = 0;

    void getSortCoffee() {
        sortCoffee[0][0] = "\t";
        sortCoffee[0][1] = "1    ";
        sortCoffee[0][2] = "  2";
        sortCoffee[0][3] = "     3";
        sortCoffee[1][0] = "A";
        sortCoffee[1][1] = "эспрессо";
        sortCoffee[1][2] = "латте   ";
        sortCoffee[1][3] = "чай";
        sortCoffee[2][0] = "B";
        sortCoffee[2][1] = "капучино";
        sortCoffee[2][2] = "мокачино";
        sortCoffee[2][3] = "раф";
        sortCoffee[3][0] = "C";
        sortCoffee[3][1] = "американо";
        sortCoffee[3][2] = "мокко   ";
        sortCoffee[3][3] = "гляссе";
        System.out.print(sortCoffee[0][0] + "\t" + sortCoffee[0][1] + "\t" + sortCoffee[0][2] + "\t\t"
                + sortCoffee[0][3] + "\n");
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-1s",sortCoffee[i][j] + "\t");
            }
            System.out.println();
        }
    }
    void check() {
        int i = 0, j = 0, k = 0;
        String selectUp = select.toUpperCase();
        switch (selectUp){
            case "A1":i = 1; j = 1; k = 0;
                break;
            case "A2":i = 1; j = 2; k = 1;
                break;
            case "A3":i = 1; j = 3; k = 2;
                break;
            case "B1":i = 2; j = 1; k = 3;
                break;
            case "B2":i = 2; j = 2; k = 4;
                break;
            case "B3":i = 2; j = 3; k = 5;
                break;
            case "C1":i = 3; j = 1; k = 6;
                break;
            case "C2":i = 3; j = 2; k = 7;
                break;
            case "C3":i = 3; j = 3; k = 9;
                break;
            default:
                System.out.println("Введен не правильный формат");
                break;
        }
            System.out.println("Вы выбрали " + sortCoffee[i][j] + " стоимостью " + priceCoffee[k] + " руб.");
            System.out.print("Внесите требуемую сумму:");/*почему в консоли указатель ввода значения встает слева
                                                           от строки, как перенести его в право?*/
        z = priceCoffee[k];
            while (true) {
                int price = in.nextInt();
                if (price == priceCoffee[k]) {
                    System.out.println("Возьмите свой " + sortCoffee[i][j]);
                    break;
                    } else {
                        if ((price - priceCoffee[k]) < 0) {
                            System.out.print("Недостаточно средств, внесите еще " +
                                    Math.abs(price - priceCoffee[k]) + " руб.");
                            priceCoffee[k] = Math.abs(price - priceCoffee[k]);
                        } else {
                            System.out.println("Не забудьте сдачу " + Math.abs(price - priceCoffee[k]) + " руб.");
                            System.out.println("Возьмите свой " + sortCoffee[i][j]);
                            break;
                        }
                }
            }
    }
}