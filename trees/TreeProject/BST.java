import java.util.LinkedList;
import java.util.Queue;

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
                System.out.println(rt.print());
                ans++;
            }
            ans += countLeaves(rt.getLeft());
            ans += countLeaves(rt.getRight());
            return ans;
        }
    }

	public boolean perfect(){
		boolean perfect = perfect(root, height(), 0);
		return perfect;
	}

	private boolean perfect(BSTNode<E> rt, int height, int currDepth) {
		if (rt == null) {
			return true;
		} else if (rt.getLeft() == null && rt.getRight() == null) {
			//leaf node
			return (height == currDepth + 1);
		} else if (rt.getLeft() == null || rt.getRight() == null) {
			//node has 1 child node, not perfect
			return false;
		}
		return perfect(rt.getLeft(), height, currDepth + 1) && perfect(rt.getRight(), height, currDepth + 1);
	}

    public boolean isBalanced() {
        boolean balanced = isBalanced(root);
        return balanced;
    }

    private boolean isBalanced(BSTNode<E> rt) {
        if (rt == null) {
            return true;
        }
        int l = height(rt.getLeft()); 
        int r = height(rt.getRight());
        return Math.abs(l-r) <= 1;
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
                size--; //don't want size to increment
                return rt; //System.out.println("duplicate element"); //ask what to do --> return exception??
            } else {
                //go left
                rt.setLeft( insert(rt.getLeft(), value) );
            }
            return rt;
        }
    }

    public E delete(E val) {
        root = delete(root, val);
        if (root != null) {
            size--;
            return val;
        } else {
            return null;
        }
    }

    private E findSmallest(BSTNode<E> rt) {
        //logic: smallest is gonna be in leftmost possible pos of tree, so need to go there
        if (rt.getLeft() != null)  {
            return findSmallest(rt.getLeft());  
        } else  {
            return rt.getValue();  
        }
    }

    private BSTNode<E> delete(BSTNode<E> rt, E val) {
        if (val == null) {
            throw new NullPointerException();
        }
        if (rt == null || find(val) == false) {
            return null;
        } else {
            if (val.compareTo(rt.getValue()) > 0) {
                //go right
                rt.setRight(delete(rt.getRight(), val));
            } else if (val.compareTo(rt.getValue()) == 0) {
                //found, now need to delete
                if (rt.getLeft() == null && rt.getRight() == null){
                    //leaf node
                    rt = null;
                } else if (rt.getLeft() != null && rt.getRight() != null) {
                    //has 2 children
                    E smallestV = findSmallest(rt.getRight());
                    rt.setValue(smallestV);
                    rt.setRight(delete(rt.getRight(), smallestV));
                } else if (rt.getRight() == null) {
                    //has 1 child
                    rt = rt.getLeft();
                }else if (rt.getLeft() == null) {
                    //has 1 child
                    rt = rt.getRight();
                    System.out.println(rt.print());
                }
            } else {
                //go left
                rt.setLeft(delete(rt.getLeft(), val));
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

    public int countParentNodes(){
        return countParentNodes(root);
    }

    private int countParentNodes(BSTNode<E> rt) {
        int leaves = countLeaves(rt);
        return getSize()-leaves;
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

    public void traverse(BSTNode<E> rt)
    {
        if (rt != null)
        {
            traverse(rt.getRight());
            System.out.print(" " + rt.getValue() + " ");
            traverse(rt.getLeft());
        }
    }

    public void bfs(){
        bfs(root);
    }

    private void bfs(BSTNode<E> root) {
        Queue<BSTNode<E>> trav = new LinkedList<BSTNode<E>>();
        trav.add(root);
        while (!trav.isEmpty()) {
            BSTNode<E> curr = trav.poll();
            System.out.print(curr.getValue() + " ");
 
            if (curr.getLeft() != null) {
                trav.add(curr.getLeft());
            }
 
            if (curr.getRight() != null) {
                trav.add(curr.getRight());
            }
        }
    }
}
