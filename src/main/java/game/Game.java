package game;

import structures.BinaryTree;
import structures.File;

import java.util.HashMap;

import java.util.Random;
import java.util.Scanner;
public class Game {
    File playerOrder;
    BinaryTree results;
    public HashMap<String, Integer > hash = new HashMap<String, Integer>();

    public Game(){
        playerOrder = new File();
        BinaryTree results = new BinaryTree();
        hash.put("3",0 );
        hash.put("4",1 );
        hash.put("5",2 );
        hash.put("6",3 );
        hash.put("7",4 );
        hash.put("8",5 );
        hash.put("9",6 );
        hash.put("10",7 );
        hash.put("J",8 );
        hash.put("Q",9 );
        hash.put("R",10 );
        hash.put("A",11 );
        hash.put("2",12 );
    }
    public void addPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("vous devez jouer à 4 minimum et 10 maximum");

        System.out.println("Entrez le nom du nouveau joueur");
        String player = scanner.nextLine();
        playerOrder.addPlayer(player);
        System.out.println("Entrez le nom du nouveau joueur");
        player = scanner.nextLine();
        playerOrder.addPlayer(player);
        System.out.println("Entrez le nom du nouveau joueur");
        player = scanner.nextLine();
        playerOrder.addPlayer(player);

        int nbPlayer = 3;
        String add = "y";
        while (add.equals("y") && nbPlayer < 10){
            nbPlayer++;
            System.out.println("Entrez le nom du nouveau joueur");
            player = scanner.nextLine();
            playerOrder.addPlayer(player);
            add = "f";
            while(!add.equals("y") && !add.equals("n") && nbPlayer< 10 ){
                System.out.println("voulez vous ajouter un nouveau joueur ? y/n");
                add = scanner.nextLine();
            }
        }
    }
    public void start(){
        this.addPlayers();
        Card[] cards = {
                new Card("3", "club", 1),
                new Card("3", "club", 1),
                new Card("3", "heart", 1),
                new Card("3", "spade", 1),
                new Card("3", "diamond", 1),
                new Card("4", "club", 2),
                new Card("4", "heart", 2),
                new Card("4", "spade", 2),
                new Card("4", "diamond", 2),
                new Card("5", "club", 3),
                new Card("5", "heart", 3),
                new Card("5", "spade", 3),
                new Card("5", "diamond", 3),
                new Card("6", "club", 4),
                new Card("6", "heart", 4),
                new Card("6", "spade", 4),
                new Card("6", "diamond", 4),
                new Card("7", "club", 5),
                new Card("7", "heart", 5),
                new Card("7", "spade", 5),
                new Card("7", "diamond", 5),
                new Card("8", "club", 6),
                new Card("8", "heart", 6),
                new Card("8", "spade", 6),
                new Card("8", "diamond", 6),
                new Card("9", "club", 7),
                new Card("9", "heart", 7),
                new Card("9", "spade", 7),
                new Card("9", "diamond", 7),
                new Card("10", "club", 8),
                new Card("10", "heart", 8),
                new Card("10", "spade", 8),
                new Card("10", "diamond", 8),
                new Card("J", "club", 9),
                new Card("J", "heart", 9),
                new Card("J", "spade", 9),
                new Card("J", "diamond", 9),
                new Card("Q", "club", 10),
                new Card("Q", "heart", 10),
                new Card("Q", "spade", 10),
                new Card("Q", "diamond", 10),
                new Card("R", "club", 11),
                new Card("R", "heart", 11),
                new Card("R", "spade", 11),
                new Card("R", "diamond", 11),
                new Card("A", "club", 12),
                new Card("A", "heart", 12),
                new Card("A", "spade", 12),
                new Card("A", "diamond", 12),
                new Card("2", "club", 13),
                new Card("2", "heart", 13),
                new Card("2", "spade", 13),
                new Card("2", "diamond", 13)
        };
        System.out.println("test");
        for (int i = 0; i < 300;i++){
            Random r = new Random();
            int low = 0;
            int high = 53;
            int card1 = r.nextInt(high-low) + low;
            int card2 = r.nextInt(high-low) + low;
            Card temp =cards[card1];
            cards[card1]= cards[card2];
            cards[card2] = temp;

        }
        for(Card card : cards){
            playerOrder.advance().hand.addMaillon(card);
        }

        boolean continuePlaying = true;
        while(continuePlaying){
            System.out.println("debug");
            Round round = new Round(this);
            continuePlaying= round.start();
        }

    }

}
