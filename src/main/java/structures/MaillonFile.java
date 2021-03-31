package structures;

import game.Player;

public class MaillonFile {
    Player player;
    MaillonFile next;

     public MaillonFile(Player player){
         this.player = player;
         this.next = null;
     }
     public void addNext(MaillonFile next){
         this.next = next;
     }
}
