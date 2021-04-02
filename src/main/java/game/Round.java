package game;

import structures.File;
import structures.Pile;

import java.util.Random;
import java.util.Scanner;

public class Round {
    int nbCardsToPlay;;
    Pile cardsPlayed;
    Game game;

    public Round(Game game){
        nbCardsToPlay = 0;
        cardsPlayed = new Pile();
        this.game = game;
    }

    public boolean start(){
        boolean continuePlaying = true;
        while (continuePlaying){
            Player currentPlayer = game.playerOrder.advance();
            while(currentPlayer.skipped){
                currentPlayer = game.playerOrder.advance();
            }
            Turn currentTurn = new Turn(currentPlayer,this);
            if(!currentTurn.playTurn()){
                currentPlayer.skipped=true;
            }
        }

        return false;

    }


}
