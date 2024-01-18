package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemAscByNameTest {
    @Test
    public void whenItemAsc() {
        List<Item> items = Arrays.asList(
                new Item("Petr"),
                new Item("Vladimir"),
                new Item("Dima"),
                new Item("Oleg"));
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item("Dima"),
                new Item("Oleg"),
                new Item("Petr"),
                new Item("Vladimir"));
        assertThat(items).isEqualTo(expected);
    }
}