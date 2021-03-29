package structures;

public class Node extends Maillon{
    public Node previous;

    public Node(Card value, Node previous, Node next){
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
    public Node(Card value, Node previous){
        this.value = value;
        this.next = null;
        this.previous = previous;
    }
    public Node(Card value){
        this.value = value;
        this.next = null;
        this.previous = null;
    }
}
