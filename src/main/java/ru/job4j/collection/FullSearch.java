package ru.job4j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    //private ArrayList<Task> tasks = new ArrayList<>();

    public HashSet<String> extractNumber(List<Task> tasks) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : tasks) {
            numbers.add(task.getNumber());
        }
    return numbers;
    }
}
