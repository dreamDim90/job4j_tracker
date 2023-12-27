package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String i : origin) {
            check.add(i);
        }
        for (String j : text) {
           if (check.contains(j)) {
               result = true;
           } else {
               result = false;
               break;
           }
        }
        return result;
    }
}
