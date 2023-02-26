package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.length];
        int s = 0;
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (name != null) {
                rsl[s] = name;
                s++;
            }
        }
        return Arrays.copyOf(rsl, s);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int s = 0;
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (key.equals(items[index].getName())) {
                rsl[s] = name;
                s++;
            }
        }
        return Arrays.copyOf(rsl, s);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}