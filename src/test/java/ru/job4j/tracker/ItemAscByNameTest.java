package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemAscByNameTest {
    @Test
    public void whenItemAsc() {
        List<Item> items = new ArrayList<>();
            items.add(new Item("Petr"));
            items.add(new Item("Vova"));
            items.add(new Item("Dima"));
            items.add(new Item("Oleg"));
        items.sort(new ItemAscByName());
        List<Item> expected = new ArrayList<>();
            items.add(new Item("Dima"));
            items.add(new Item("Oleg"));
            items.add(new Item("Petr"));
            items.add(new Item("Vova"));
        assertThat(items).isEqualTo(expected);
    }
}