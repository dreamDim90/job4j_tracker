package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setUserName("Nazukin Vldislav Andreevich");
        student.setGroup("AD 07");
        student.setCreated(new Date());
        System.out.println(student.getUserName());
        System.out.println(student.getGroup());
        System.out.println(student.getCreated());
    }
}
