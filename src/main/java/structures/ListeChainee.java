package structures;

import game.Card;

public class ListeChainee {
    public Maillon first;

    public ListeChainee(){
        this.first = null;
    }

    public void addMaillon(Card value){
        Maillon newFirst= new Maillon(value, this.first);
        this.first = newFirst;
    }


}
