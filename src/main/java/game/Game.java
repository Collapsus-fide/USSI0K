package game;

import structures.File;

import java.util.HashMap;

import java.util.Scanner;
public class Game {
    File playerOrder;

    public Game(){
        playerOrder = new File();
    }
    public void addPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("vous devez jouer à 4 minimum et 10 maximum");

        System.out.println("Entrez le nom du nouveau joueur");
        System.out.println("debug");
        String player = scanner.nextLine();
        System.out.println("debug1");
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
        Round round = new Round(this);
        //round.start();
    }
    public HashMap<String, Integer > hash = new HashMap<String, Integer>();
        /*hash.put("3",0 );
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
        hash.put("2",12 );*/
}
