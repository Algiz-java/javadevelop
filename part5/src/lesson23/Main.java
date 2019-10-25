package lesson23;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyBasketClass myBasketClass = new MyBasketClass();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Пункты меню: " + "\n" + "1 - Добавить товар" + "\n" + "2 - Изменить количество товара"
                    + "\n" + "3 - Удалить товар" + "\n" + "4 - Очистить корзину" + "\n" + "5 - Показать корзину"
                    + "\n" + "6 - Выйти из программы" + "\n" + "Введите цифру: ");
            switch (in.nextLine()) {
                case "1":
                    newProduct(myBasketClass);
                    break;
                case "2":
                    printProduct(myBasketClass);
                    updateQuantityProduct(myBasketClass);
                    break;
                case "3":
                    printProduct(myBasketClass);
                    deleteProduct(myBasketClass);
                    break;
                case "4":
                    myBasketClass.clear();
                    printProduct(myBasketClass);
                    break;
                case "5":
                    printProduct(myBasketClass);
                    break;
                case "6":
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private static void deleteProduct(MyBasketClass myBasketClass) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите номер товара для удаления: ");
            myBasketClass.removeProduct(myBasketClass.getProducts().get(in.nextInt() - 1));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Ошибка! Товара с таким номером нет в корзине");
        }
    }

    private static void printProduct(MyBasketClass myBasketClass) {
        System.out.println("Ваш заказ: ");
        int count = 0;
        for (int i = 0; i <myBasketClass.getProducts().size() ; i++) {
            System.out.println((i + 1) + ". "+ myBasketClass.getProducts().get(i) + " "
                    + myBasketClass.getQuantity().get(i) + " шт.");
            count += myBasketClass.getQuantity().get(i);
        }
        System.out.println("Итого товара: " + count + " шт.");
    }

    private static void newProduct(MyBasketClass myBasketClass) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите наименование товара: ");
        String goods = in.nextLine();
        System.out.print("Введите количество: ");
        int quantity = in.nextInt();
        myBasketClass.addProduct(goods, quantity);
    }
    private static void updateQuantityProduct(MyBasketClass myBasketClass) {
        if (myBasketClass.getProducts().size() !=0) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите номер товара для изменения: ");
            try {
                String goods = myBasketClass.getProducts().get(in.nextInt() - 1);
                System.out.print("Введите количество: ");
                int quantity = in.nextInt();
                myBasketClass.updateProductQuantity(goods, quantity);
            }catch (IndexOutOfBoundsException e){
                System.out.println("Ошибка! Товара с таким номером нет в корзине");
            }

        }
    }
}