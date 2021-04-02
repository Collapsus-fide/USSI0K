package game;

import structures.ListeChainee;
import java.util.Scanner;

public class Player {
    String name;
    ListeChainee hand;
    boolean skipped = false;

    public Player(String name){
        this.name = name;
        hand = new ListeChainee();
    }

}

