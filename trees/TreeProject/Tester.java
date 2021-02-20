public class Tester {
    public static void main(String[] args) {
        // BSTNode<String> a = new BSTNode<String>("apple");
        // BSTNode<String> b = new BSTNode<String>("banana");
        // BSTNode<String> c = new BSTNode<String>("cantalope");
        // BSTNode<String> d = new BSTNode<String>("durian");
        
        // c.setLeft(b);
        // b.setLeft(a);
        // c.setRight(d);
        
        // System.out.println(c.inorder(c));
        // System.out.println(b.countLeaves(b));

        BST<String> tree = new BST<String>();
        tree.insert("apple");
        tree.insert("banana");
        tree.insert("coconut");
        tree.insert("durian");
        tree.insert("orange");

        System.out.println(tree.countLeaves(tree.getRoot()));
        System.out.println(tree.getRoot().print());
        System.out.println(tree.inorder(tree.getRoot()));
    }

    
}