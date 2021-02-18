public class BST<E> {

    public static void main(String[] args) {
        BSTNode<String> a = new BSTNode<String>("apple");
        BSTNode<String> b = new BSTNode<String>("banana");
        BSTNode<String> c = new BSTNode<String>("cantalope");
        BSTNode<String> d = new BSTNode<String>("durian");
        
        c.setLeft(b);
        b.setLeft(a);
        c.setRight(d);
        
        System.out.println(printTree(c));
        System.out.println(b.countLeaves(b));
    }

    /* DFS */
    public static String printTree(BSTNode<String> rt){
        if(rt == null){
            //occurs when we hit a leaf node --> backtrack to previous node and add val to traversal
            //also search right subtree if it exists
            return "";
        } else{
            String out = "";
            out += printTree(rt.getLeft()); //searching left subtree
            out += " " + rt.getValue() + " ";
            out += printTree(rt.getRight()); //searching right substree
            return out;
        }
    }
        
}
