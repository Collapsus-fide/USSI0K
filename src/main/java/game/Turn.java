package game;

import structures.Pile;
import java.util.Scanner;

public class Turn {
    Player player;
    Round round;
    int nbCardsToPlay;
    String value;

    public boolean checkNbCardsOfValueInHand() {
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

    public boolean compareValues(String pileValue, String currentValue) {

        return (round.game.hash.get(pileValue) <= round.game.hash.get(currentValue));


    }

    public void playAction() {
        Pile cardsPlayed = player.hand.playNCardsWithValue(nbCardsToPlay, value);
        round.cardsPlayed.fusion(cardsPlayed);
    }

    public boolean playTurn() {
        boolean res = false;
        player.hand.display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez vous passer votre tour ? y/n");
        String choice = scanner.nextLine();
        if (choice == "y" || choice == "n") {
            if (choice == "n") {
                res = true;
                boolean success = false;
                boolean checkValueIsUpper = false;
                boolean play = true;
                while (!success && !checkValueIsUpper && play) {

                    value = scanner.nextLine();
                    success = this.checkNbCardsOfValueInHand();
                    checkValueIsUpper = this.compareValues(round.cardsPlayed.getFirst().val, value);

                }
            } else {
                System.out.println("Vous avez passé votre tour.");
            }

        }
        return res;

    }
}

