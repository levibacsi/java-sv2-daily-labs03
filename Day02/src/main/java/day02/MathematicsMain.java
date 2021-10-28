package day02;

import java.util.Scanner;

public class MathematicsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mathematics mathematics = new Mathematics();
        System.out.println("Number?");
        int number = scanner.nextInt();
        System.out.println("Prime: " + ( number == 2 || number == 3 || mathematics.isPrime(number)));

    }
}
