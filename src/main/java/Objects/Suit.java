package Objects;

import java.util.Random;

public enum Suit {
    heart,
    diamond,
    club,
    spade;
    /** Get a random suit
     * @return Suit
     */
    public static Suit generateSuit() {
        Random rand = new Random();
        return values()[rand.nextInt(values().length)];
    }
}
