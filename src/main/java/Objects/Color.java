package Objects;

import java.util.Random;

public enum Color {
    đỏ,
    đen,
    vàng,
    xanh;
    /** Get a random color
     * @return Color
     */
    public static Color generateColor() {
        Random rand = new Random();
        return values()[rand.nextInt(values().length)];
    }

}
