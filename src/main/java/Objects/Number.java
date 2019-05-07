package Objects;

import java.util.Random;

public class Number {
    //private int value;
    public static int generateNumber(){
        Random rand = new Random();
        return rand.nextInt(6);
    }
}
