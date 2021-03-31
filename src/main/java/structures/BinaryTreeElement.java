package structures;

import game.Player;

import javax.swing.text.Element;

public class BinaryTreeElement {
    private int score;
    private Player player;
    public int round;
    private BinaryTreeElement rightSon;
    private BinaryTreeElement leftSon;

    BinaryTreeElement(Player player, int score, int round){
        this.player = player;
        this.score = score;
        this.round = round;
    }

    public void add(BinaryTreeElement E){
        if(this.round >= E.round){
            if(this.leftSon == null) {
                this.leftSon = E;
            }else{
                this.leftSon.add(E);
            }
        }
        else{
            if(this.rightSon == null){
                this.rightSon = E;
            }else{
                this.rightSon.add(E);
            }
        }
    }

}
