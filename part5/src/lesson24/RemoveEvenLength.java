package lesson24;

import java.util.Set;

class RemoveEvenLength {
    Set<String> removeEvenLength(Set<String> set) {
        String[] strings = set.toArray(new String[0]);
        int size = set.size();
        set.clear();
        for (int i = 0; i < size; i++) {
            if (strings[i].length() % 2 != 0) {
                set.add(strings[i]);
            }
        }
        return set;
    }
}