package day04;

import java.util.Scanner;

public class Day04Main {
    public static void main(String[] args) {
        Day04 day04 = new Day04();

        System.out.println(day04.dividerLister());
        System.out.println("Door number?");
        Scanner scanner = new Scanner(System.in);
        int door = scanner.nextInt();
        String message = "Closed";
        if (day04.dividerLister().get(door-1) == 1) {
            message = "Open";}
        System.out.println(message);

    }
}
