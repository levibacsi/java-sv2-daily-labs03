package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day04 {
    public int dividerCounter(int number) {
        int numberOfDividers = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                numberOfDividers++;
            }
        }
        ;
        return numberOfDividers;
    }

    public List<Integer> dividerLister() {
        List<Integer> elements = new ArrayList<>(Arrays.asList());
        for (int i = 1; i <= 100; i++) {
            elements.add(dividerCounter(i));
        }

        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i) % 2 == 0) {
                elements.set(i, 0);
            } else {
                elements.set(i, 1);
            }
        }



        return elements;
    }




}
