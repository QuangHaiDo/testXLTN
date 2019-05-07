package Objects;

import java.util.Random;

public enum Color {
    red,
    black;
    /** Get a random color
     * @return Color
     */
    public static Color generateColor() {
        Random rand = new Random();
        return values()[rand.nextInt(values().length)];
    }

}
