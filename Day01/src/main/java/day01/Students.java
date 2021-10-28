package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Students {
        public List<Integer> heights = new ArrayList<>(Arrays.asList(123, 129, 129, 145));

        public void addHeight (int height){
            heights.add(height);
        }

        public boolean isIncreasing () {
            boolean increasing = true;
            for (int i = 0; i < heights.size() -1; i++) {
                if( heights.get(i) > heights.get(i + 1)){
                    increasing = false;
                    i = heights.size();
                }
            }
            return increasing;
        };
}
