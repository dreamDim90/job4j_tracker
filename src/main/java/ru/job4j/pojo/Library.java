package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 459);
        Book book1 = new Book("Stalingrad", 234);
        Book book2 = new Book("Hobbits", 543);
        Book cleanCode = new Book("Clean code", 0);
        Book[] books = new Book[4];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }
        System.out.println("Replace book to book1");
        Book temp = books[0];
        books[0] = books[1];
        books[1] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + " - " + bo.getPages());
        }
        System.out.println("Shown only book Clean code");
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            if (bo.getName().equals("Clean code")) {
                System.out.println(bo.getName() + " - " + bo.getPages());
            }
        }
    }
}
