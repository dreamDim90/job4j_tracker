package ru.job4j.pojo;

public class Shop {

    public static int indexOfNull(Product[] products) {
        int rsl = -1;
        for (int i = 0; i < products.length; i++) {
            if (null == products[i]) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
