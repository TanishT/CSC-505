import jdk.jfr.BooleanFlag;

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

	public int height() {
		int h = height(root);
		return h;
	}

	private int height(BSTNode<E> rt){
		if(rt == null){
            return -1;
        } else {
			int l = height(rt.getLeft());
			int r = height(rt.getRight());
			int height = Math.max(l,r) + 1;
			return height;
        }
	}

	public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(BSTNode<E> rt) {
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

	public boolean perfect(){
		boolean perfect = perfect(root, leftMostDepth(root), 0);
		return perfect;
	}

	public int leftMostDepth(BSTNode<E> rt){
		int depth = 0;
		while (rt != null) {
			depth++;
			rt = rt.getLeft();
		}
		return depth;
	}

	private boolean perfect(BSTNode<E> rt, int leftDepth, int currDepth) {
		if (rt == null) {
			return true;
		} else if (rt.getLeft() == null && rt.getRight() == null) {
			//leaf node
			return (leftDepth == currDepth + 1);
		} else if (rt.getLeft() == null || rt.getRight() == null) {
			//node has 1 child node, not perfect
			return false;
		}
		return perfect(rt.getLeft(), leftDepth, currDepth + 1) && perfect(rt.getRight(), leftDepth, currDepth + 1);
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
            } else if (value.compareTo(rt.getValue()) == 0) {
                System.out.println("duplicate element"); //ask what to do --> return exception??
            } else {
                //go left
                rt.setLeft( insert(rt.getLeft(), value) );
            }
            return rt;
        }
    }

	public boolean find(E value) {
		boolean found = find(root, value);
		return found;
	} 

	private boolean find(BSTNode<E> rt, E value) {
		//base case
        if (rt == null) {
            return false;
        }
        //recursive case
        else {
			boolean found = false;
            if( value.compareTo(rt.getValue()) > 0) {
                //go right
                found = find(rt.getRight(), value);
            } else if (value.compareTo(rt.getValue()) == 0) {
                return true;
            } else {
                //go left
                found = find(rt.getLeft(), value);
            }
            return found;
        }
	}

    public String inorder(){
        return inorder(root);
    }

    /* DFS more or less */
    private String inorder(BSTNode<E> rt){
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