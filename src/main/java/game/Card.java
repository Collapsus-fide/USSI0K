package game;

public class Card {
    public String val;
    public String suit;
    public int points;

    public void display(){
        System.out.println("valeur : "+ this.val +"\n symbole : "+ this.suit);
    }
}
