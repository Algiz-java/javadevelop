package lesson13;

class Child {
    String food;
    void eat() {
        try {
            if (food.equals("яблоко") || food.equals("апельсин") || food.equals("кашу") || food.equals("мандарин")
                    || food.equals("банан")){
                System.out.println("Съел " + food + " за обе щеки!");
            }else {
                notFood();}
        }catch (MyException e) {
            System.out.println(e.getMessage() + food);
        }finally {
            System.out.println("Спасибо, мама");
        }
    }
private static void notFood(){
    throw new MyException("Я не буду кушать ");
}
}
