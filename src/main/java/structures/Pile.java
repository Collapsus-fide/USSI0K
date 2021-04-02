package structures;

import game.Card;

import java.util.Random;

public class Pile {
    Maillon first;

    public Pile(){
        this.first = null;
    }

    public void addMaillon(Maillon newMaillon){
        newMaillon.next = this.first;
        this.first = newMaillon;
    }

    public void addCard(Card card){
        addMaillon(new Maillon(card));
    }
    public Card getFirst(){
        return this.first.value;
    }

    public Maillon depilate(){

        Maillon res = this.first;
        this.first = this.first.next;
        return res;
    }
    public void fusion(Pile pile){
        while(pile.first != null){
            this.addMaillon(pile.depilate());
        }

    }
    public boolean nfirstsIdenticals(int n){
        boolean res = true;
        Maillon current = this.first;
        for (int i=0;i<n-1;i++){
            if (current.value.val != current.next.value.val){
                res = false;
            }
        }
        return res;
    }




}


