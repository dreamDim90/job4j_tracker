package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("idim@yandex.ru", "Dmitriy Mihaylin");
    map.put("alex@yandex.ru", "Alexey Alexeev");
    map.put("rom77@yandex.ru", "Rovan Romanov");
    map.put("ilex@yandex.ru", "Lex Luter");
    map.put("idim@yandex.ru", "Peter Parker");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }
    }
}
