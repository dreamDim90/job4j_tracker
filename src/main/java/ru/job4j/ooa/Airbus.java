package ru.job4j.ooa;

public final class Airbus extends Aircraft {
    private static int COUNT_ENGINE = 2;
    public String name;

    public Airbus(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printModel() {
        System.out.println("Модель самолета: " + name);
    }

    public void printCountEngine() {
        String a380 = "A380";
        COUNT_ENGINE = name.equals(a380) ? 4 : 2;
        System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }

}
