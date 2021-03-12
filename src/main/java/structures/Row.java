package structures;

import game.Card;

public class Row {
    int length;
    Node first;
    Node last;

    public Row(){
        this.length = 0;
        this.first = null;
        this.last = null;
    }

    public void addNode(Card value){
        if(this.length == 0){
            this.first = this.last = new Node(value);
        }
        else{
            this.last = new Node(value, this.last);
            this.last.previous.next = this.last;
        }
        this.length++;
    }

    public Card pullNode(){
        Card value = null;
        if(this.length > 0){
            value = this.first.value;
            if(this.length > 1){
                this.first = (Node) this.first.next;
                this.first.previous = null;
            }else{
                this.first = this.last = null;
            }
            this.length--;
        }
        return value;
    }

    public boolean isEmpty(){
        return this.length == 0;
    }
    public String display(){
        String display = "\n Row status:\n";
        Maillon maillon = this.first;
        while(maillon != null){
            display += maillon.value + " ";
            maillon = maillon.next;
        }
        return display;
    }
}
