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

        //tree test
        BST<String> tree = new BST<String>();
        tree.insert("durian");
        tree.insert("coconut");
        //tree.insert("banana");

        //duplicate element test
        //tree.insert("coconut");

        //tree.insert("apple");
        tree.insert("orange");
        tree.insert("xylophone");
        tree.insert("elephant");

        System.out.println(tree.countLeaves());
        System.out.println(tree.getRoot().print());
        System.out.println(tree.inorder());

        //find method test
        System.out.println(tree.find("apple"));

        //height method test
        System.out.println(tree.height());

        //perfect method test 
        System.out.println(tree.perfect());

        //System.out.println(tree.height() +" , " + tree.leftMostDepth(tree.getRoot()));
    }

    
}