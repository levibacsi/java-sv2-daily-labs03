package Day03;

import java.util.Scanner;

public class GuessTheNumberMain {
    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println(guessTheNumber.randomNumber);

        int guesses = 6;

        for (int i = 0; i < guesses; i++){
            System.out.println("Your guess?");
            int guess = scanner.nextInt();
            if (guess == guessTheNumber.randomNumber){
                System.out.println("You guessed right!");
                i = guesses;
            }
            if (guess < guessTheNumber.randomNumber) {
                System.out.println("Your guess is too low.");
            }
            if (guess > guessTheNumber.randomNumber) {
                System.out.println("Your guess is too high.");
            }
        }
        System.out.println("The right number is:" + guessTheNumber.randomNumber);
    }

}
