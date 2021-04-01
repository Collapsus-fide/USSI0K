package game;

import structures.File;

import java.util.HashMap;

import java.util.Scanner;
public class Game {
    File playerOrder;

    public void addPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("vous devez jouer à 4 minimum et 10 maximum");
        //playerOrder.addplayer();
        //playerOrder.addplayer();
        //playerOrder.addplayer();

        String add = "y";
        while (add == "y"){
            //playerOrder.addPlayer();
            add = null;
            while(add != "y" || add != "n"){
                System.out.println("voulez vous ajouter un nouveau joueur ? y/n");
                add = scanner.nextLine();
            }

        }



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
