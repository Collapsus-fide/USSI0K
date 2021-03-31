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

    void display(){
        if(this.first != null){
            this.first.display();
        }else{
            System.out.println("Main vide");
        }
    }


}
