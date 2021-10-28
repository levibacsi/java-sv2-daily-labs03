package day02;

import static java.lang.Math.sqrt;

class Mathematics {
    private int number;

    public boolean isPrime(int number) {
        boolean b = false;
        for (int i = 2; i <= sqrt(number); i++){
            if (number % i == 0){
                b = false;
                break;
            } else{
                b = true;
            }
        }
    return b;}

}


