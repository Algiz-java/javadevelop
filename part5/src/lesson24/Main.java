package lesson24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("foo");
        set.add("buzz");
        set.add("bar");
        set.add("fork");
        set.add("bork");
        set.add("!");
        set.add("!!");
        set.add("spoon");
        set.add("dude");
        System.out.println(set);
        System.out.println(new RemoveEvenLength().removeEvenLength(set));
    }
}
