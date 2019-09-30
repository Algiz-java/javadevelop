package lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String phrase;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фразу: ");
        phrase = in.nextLine();
        String[] template = {".*\\sбяка", ".*\\sбяка\\s.*", "бяка\\s.*", "бяка.*", "\\sбяка.*"};
        for (int i = 0; i < 5; i++) {
            if (phrase.matches(template[i])) {
                Change change = new Change();
                change.word = phrase;
                change.i = i;
                change.change();
                break;
            }
        }
    }
}