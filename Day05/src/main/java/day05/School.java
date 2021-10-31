package day05;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Journal journal = new Journal();

        journal.addStudents("Jim Bean");
        journal.addStudents("Sandokan");

        System.out.println(journal.getStudents());
    }
}
