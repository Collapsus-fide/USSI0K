package game;

import structures.Pile;

import java.util.Scanner;

public class Turn {
    Player player;
    Round round;

    String value;


    public Turn(Player player, Round round ){
        this.player = player;
        this.round = round;
        this.value ="";
    }

    public String checkNbCardsOfValueInHand() {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("choisissez une valeur à jouer");
        value = scanner.nextLine();
        int count = player.hand.countCardsWithValue(value);
        boolean playable =true;
        while(count == 0 || !playable){
            System.out.println("Pas assez de cartes de cette valeur");
            System.out.println("choisissez une valeur à jouer");
            value = scanner.nextLine();
            count = player.hand.countCardsWithValue(value);
            if (count < round.nbCardsToPlay){
                playable = false;
            }else{
                playable = true;
            }
        }
        if (round.nbCardsToPlay == 0){
            System.out.println("Combien de cartes de cette valeur voulez vous jouer ? Vous en avez " + count + " dans votre main");
            int tempNbCards = scanner.nextInt();
            while(tempNbCards > count){
                System.out.println("Vous n'avez pas autant de cartes de catte valeur");
                System.out.println("Combien de cartes de cette valeur voulez vous jouer ? Vous en avez " + count + " dans votre main");
                tempNbCards = scanner.nextInt();
            }
            round.nbCardsToPlay = tempNbCards;
        }
        return value;
    }

    public boolean compareValues(String pileValue, String currentValue) {
        boolean res = true;
        /*if(pileValue != null){
            res = round.game.hash.get(currentValue)>=round.game.hash.get(pileValue);
        }*/
        return res;


    }

    public void playAction() {
        Pile cardsPlayed = player.hand.playNCardsWithValue(round.nbCardsToPlay, value);
        round.cardsPlayed.fusion(cardsPlayed);
    }

    public boolean playTurn() {
        boolean res = false;
        System.out.println("joueur"+ player.name + "c'est à vous de jouer");
        player.hand.display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez vous passer votre tour ? y/n");
        String choice = scanner.nextLine();
        if (choice.equals("y")  || choice.equals("n") ) {
            if (choice.equals("n") ) {
                res = true;
                boolean success = false;
                boolean checkValueIsUpper = false;
                while (!checkValueIsUpper && !player.skipped) {
                    value=this.checkNbCardsOfValueInHand();
                    if(round.cardsPlayed.getFirst() == null){
                        checkValueIsUpper = true;
                    }else{
                        checkValueIsUpper = this.compareValues(round.cardsPlayed.getFirst().value.val, value);
                    }



                }
            } else {
                System.out.println("Vous avez passé votre tour.");
            }

        }
        return res;

    }
}

