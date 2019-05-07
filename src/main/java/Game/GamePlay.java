package Game;

import Objects.Card;
import Objects.CardList;

import java.util.Scanner;

public class GamePlay {

    public GamePlay() {

        CardList cardList = new CardList();
        Scanner sc = new Scanner(System.in);
        int score = 0;

        while(true) {

            /**
             *  Generate new cardList, number of card = score +1
             */
            cardList.generateCardList(score+1);
            cardList.showCardList();


            for(Card b :cardList.getList()){
                /**
                 * player answering
                 */
                int guestNumber = sc.nextInt();
                String guestSuit = sc.next();
                String guestColor = sc.next();


                if (b.compare(guestNumber,guestSuit.toLowerCase(),guestColor.toLowerCase())){

                }
                else {

                    /** Xu ly sai va thoat game*/

                    System.out.println("Wrong !!!");
                    System.out.println("Score: "+score);
                    System.exit(0);

                }
            }
            System.out.println("Correct !!!");
            score++;
        }
    }
}
