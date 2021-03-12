package structures;

import game.Card;

public class Maillon {
    public Card value;
    public Maillon next;

    public Maillon(){
        this.value = null;
        this.next = null;
    }
    public Maillon(Card value){
        this.value = value;
        this.next = null;
    }

    public Maillon(Card value, Maillon next){
        this.value = value;
        this.next = next;
    }


}
