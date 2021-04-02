package game;

import structures.File;
import structures.Pile;

import java.util.Random;
import java.util.Scanner;

public class Round {
    int nbCards = 0;
    Pile cardsPlayed;
    Game game;

    public Round(Game game){
        nbCards = 0;
        cardsPlayed = new Pile();
        this.game = game;
    }

    public boolean start(){


        return false;

    }


}
