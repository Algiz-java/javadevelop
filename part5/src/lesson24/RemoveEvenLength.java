package lesson24;

import java.util.Set;

class RemoveEvenLength {
    Set<String> removeEvenLength(Set<String> set) {
        set.removeIf(s -> s.length() % 2 == 0);
        return set;
    }
}