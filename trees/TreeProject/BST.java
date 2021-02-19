public class BST {

    public static void main(String[] args) {
        BSTNode<String> a = new BSTNode<String>("apple");
        BSTNode<String> b = new BSTNode<String>("banana");
        BSTNode<String> c = new BSTNode<String>("cantalope");
        BSTNode<String> d = new BSTNode<String>("durian");
        
        c.setLeft(b);
        b.setLeft(a);
        c.setRight(d);
        
        System.out.println(inorder(c));
        System.out.println(b.countLeaves(b));
    }

    /* DFS more or less */
    public static String inorder(BSTNode<String> rt){
        if(rt == null){
            //occurs when we hit a leaf node --> backtrack to previous node and add val to traversal
            //also search right subtree if it exists
            return "";
        } else{
            String out = "";
            out += inorder(rt.getLeft()); //searching left subtree
            out += " " + rt.getValue() + " ";
            out += inorder(rt.getRight()); //searching right subtree
            return out;
        }
    }
        
}
