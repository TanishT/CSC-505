public class BST<E extends Comparable<E>> {
    private BSTNode<E> root;
    private int size;
    
    public BST() {
        root = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public BSTNode<E> getRoot(){
        return root;
    }
    
    //add the parameter value to the tree
    public void insert(E value) {
        root = insert(root, value);
        size++;
    }
    
    //helper method for insert
    private BSTNode<E> insert(BSTNode<E> rt, E value) {
        //base case
        if (rt == null) {
            return new BSTNode<E>(value);
        }
        //recursive case
        else {
            if( value.compareTo(rt.getValue()) > 0) {
                //go right
                rt.setRight( insert(rt.getRight(), value) );
            } 
            else if (value.compareTo(rt.getValue()) == 0) {
                System.out.println("duplicate element"); //ask what to do --> return exception??
                //return null;
            }
            else {
                //go left
                rt.setLeft( insert(rt.getLeft(), value) );
            }
            return rt;
        }
    }

    public int countLeaves() {
        return countLeaves(root);
    }

    public int countLeaves(BSTNode<E> rt) {
        if(rt == null){
            return 0;
        } else {
            int ans = 0;
            if (rt.isLeaf()) {
                ans++;
            }
            ans += countLeaves(rt.getLeft());
            ans += countLeaves(rt.getRight());
            return ans;
        }
    }

    public String inorder(){
        return inorder(root);
    }

    /* DFS more or less */
    public String inorder(BSTNode<E> rt){
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