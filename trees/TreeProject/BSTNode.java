public class BSTNode<E extends Comparable<E>> {
    E value;
    BSTNode left;
    BSTNode right;
    
    BSTNode (E v) {
        value = v;
        left = null;
        right = null;
    }
    
    BSTNode() {
        value = null;
        left = null;
        right = null;
    }
}
