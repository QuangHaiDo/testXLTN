package Objects;

import java.util.Random;

public enum Suit {
    cơ,
    rô,
    nhép,
    bích;
    /** Get a random suit
     * @return Suit
     */
    public static Suit generateSuit() {
        Random rand = new Random();
        return values()[rand.nextInt(values().length)];
    }
}
