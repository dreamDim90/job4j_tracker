package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void whenItemDesc() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Petr"));
        items.add(new Item("Vova"));
        items.add(new Item("Dima"));
        items.add(new Item("Oleg"));
        items.add(new Item("Andrew"));
        items.sort(new ItemDescByName());
        List<Item> expected = new ArrayList<>();
        expected.add(new Item("Vova"));
        expected.add(new Item("Petr"));
        expected.add(new Item("Oleg"));
        expected.add(new Item("Dima"));
        expected.add(new Item("Andrew"));
        assertThat(items).isEqualTo(expected);
    }
}