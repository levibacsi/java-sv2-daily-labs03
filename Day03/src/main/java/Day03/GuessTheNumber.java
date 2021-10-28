package Day03;

import java.util.Random;

public class GuessTheNumber {
    Random random = new Random();
    int randomNumber = random.nextInt(1, 101);

    public int getRandomNumber() {
        return randomNumber;
    }
}

