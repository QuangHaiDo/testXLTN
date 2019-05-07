package Objects;

public class Card {
    Color color;
    int number;
    Suit suit;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Suit getSuit(){return suit;}
    public Card() {
        this.color = Color.generateColor();
        this.number = Number.generateNumber();
        this.suit = Suit.generateSuit();
    }
    public boolean compare(int number,String suit,String color){
        /*
        System.out.println(this.number+ " "+ this.color +" " +this.suit);
        System.out.println(number+ " "+color +" " +suit);*/
        if (this.getNumber()== number &&
                this.getColor().toString().compareTo(color)== 0 &&
                this.getSuit().toString().compareTo(suit)==0
        )
                return true;
        return false;
    }
}
