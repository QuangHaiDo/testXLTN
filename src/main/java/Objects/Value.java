package Objects;

import java.util.Random;

public enum Value {
    Ace,
    two,
    three,
    four,
    five,
    six,
    seven,
    eight,
    nine,
    ten;
    public static Value generateValue(){
        Random rand = new Random();
        return values()[rand.nextInt(values().length)];
    }
}
