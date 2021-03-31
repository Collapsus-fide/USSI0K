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

    public void display(){
        if(this.first != null){
            this.first.display();
        }else{
            System.out.println("Main vide");
        }

    }

    public int countCardsWithValue(String value){
        int count = 0;
        Maillon current = first;
        while (current != null){
            if (current.value.val == value){
                count++;
            }
            current = current.next;
        }
        return count;
    }

    public void playNCardsWithValue(int n, String value){
        Maillon current = first;
        Maillon previous = null;
        while(n > 0){
            if(current.value.val == value ){

                if (previous == null){
                    this.first = current.next;
                }else {
                previous.next = current.next;
                n--;
            }

            }
        }
    }


}
