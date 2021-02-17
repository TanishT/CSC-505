public class BST<E> {
    BSTNode<E> root;
    
    public BST(BSTNode<E> r) {
        root = r;
    }
    
    public BST(E v) {
        root.value = v;
        root.left = null;
        root.right = null;
    }
    
    public BST(){
        root = left = right = null;
    }
        
}
