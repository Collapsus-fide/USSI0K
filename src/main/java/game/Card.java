package game;

public class Card {
    public String val;
    public String suit;
    public int points;

    public Card(String val, String suit, int points){
        this.val = val;
        this.suit = suit;
        this.points = points;
    }
    public void display(){
        System.out.println("valeur : "+ this.val +"\n symbole : "+ this.suit);
    }
}
