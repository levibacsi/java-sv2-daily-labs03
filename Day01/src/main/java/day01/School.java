package day01;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Students students = new Students();
        Scanner scanner = new Scanner(System.in);
        System.out.println("New height?");
        int height = scanner.nextInt();
        students.addHeight(height);

        System.out.println(students.heights);
        System.out.println("Are heights increasing? " + students.isIncreasing());
    }
}
