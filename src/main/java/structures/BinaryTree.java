package structures;

public class BinaryTree {
    BinaryTreeElement root;
    public BinaryTree(){
        this.root = null;
    }

    void addNewElement(BinaryTreeElement E){
        if(this.root == null){
            this.root = E;
        }else{
            this.root.add(E);
        }
    }
}
