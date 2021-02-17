public class BSTNode<E extends Comparable<E>> {
    E value;
    BSTNode left;
    BSTNode right;
    
    BSTNode (E v) {
        value = v;
        left = right = null;
    }
    
    BSTNode() {
        value = left = right = null;
    }
    
    public E getValue(){
        return value;
    }
    
    public BSTNode getLeft(){
        return left;
    }
    
    public BSTNode getRight(){
        return right;
    }
    
    public E setValue(E n){
        value = n;
    }
    
    public BSTNode setLeft(BSTNode n){
        left = n;
    }
    
    public BSTNode setRight(BSTNode n){
        right = n;
    }
}
