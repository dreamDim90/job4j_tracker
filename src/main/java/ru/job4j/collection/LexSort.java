package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftStr = left.split("\\. ");
        String[] rightStr = right.split("\\. ");
        if (leftStr.length == 0 || rightStr.length == 0) {
            return 0;
        } else {
           return Integer.compare(Integer.parseInt(leftStr[0]), Integer.parseInt(rightStr[0]));
        }
    }
}
