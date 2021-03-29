package structures;

import game.Card;

public class Pile {
    Maillon first;

    public Pile(){
        this.first = null;
    }

    public void addMaillon(Maillon newMaillon){
        newMaillon.next = this.first;
        this.first = newMaillon;
    }
    public Card getFirst(){
        return this.first.value;
    }

    public void depilate(){
        this.first = this.first.next;
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


