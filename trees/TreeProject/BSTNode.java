public class BSTNode<E extends Comparable<E>> {
    private E value;
    private BSTNode<E> left;
    private BSTNode<E> right;
    
    public BSTNode (E v) {
        value = v;
        left = right = null;
    }
    
    public E getValue(){
        return value;
    }
    
    public BSTNode<E> getLeft(){
        return left;
    }
    
    public BSTNode<E> getRight(){
        return right;
    }
    
    public void setValue(E n){
        value = n;
    }
    
    public void setLeft(BSTNode<E> n){
        left = n;
    }
    
    public void setRight(BSTNode<E> n){
        right = n;
    }

    public boolean isLeaf() {
        return (this.left == null && this.right == null);
    }

    public String print(){
        String node = "";
        node += "value --> " + value;
        if (left != null) {
            node += " , left --> " + left.getValue();
        } 
        if (right != null) {
            node += " , right --> " + right.getValue();
        }
        return node; //"value --> " + value + " , left --> " + left.getValue() + " , right --> " + right.getValue();
    }
}
