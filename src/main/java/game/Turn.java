package game;

import java.util.Scanner;

public class Turn {
    Player player;
    Round round;
    int nbCardsToPlay;
    String value;

    public boolean checkNbCardsOfValueInHand(){
        boolean check = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("choisissez une valeur à jouer");
        value = scanner.nextLine();
        int count = player.hand.countCardsWithValue(value);
        System.out.println("Combien de cartes de cette valeur voulez vous jouer ? Vous en avez " + count + " dans votre main");
        nbCardsToPlay = scanner.nextInt();

        if (nbCardsToPlay > count) {
            System.out.println("Vous n'avez pas autant de cartes de cette valeur");
        } else if (round.nbCards == 0) {
            round.nbCards = nbCardsToPlay;
            check = true;
        } else if (round.nbCards >= nbCardsToPlay) {
            check = true;
        }
        return check;
    }

        public void playAction(){
        player.hand.playNCardsWithValue(nbCardsToPlay,value);

        }
    public void playTurn() {
        player.hand.display();
        boolean success = false;
        while (success == false){
            success =this.checkNbCardsOfValueInHand();
        }

    }

}

