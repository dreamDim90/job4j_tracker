package ru.job4j.oop;

public class Error {


    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }
    public Error() {
    }

    public void printInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 6, "Error 404");
        Error errors = new Error();
        error.printInfo();
        errors.printInfo();
    }
}
