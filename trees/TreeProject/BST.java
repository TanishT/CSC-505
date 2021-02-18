public class BST<E> {

    public static void main(String[] args) {
        BSTNode<String> a = new BSTNode<String>("apple");
        BSTNode<String> b = new BSTNode<String>("banana");
        BSTNode<String> c = new BSTNode<String>("cantalope");
        BSTNode<String> d = new BSTNode<String>("durian");
        
        c.setLeft(b);
        b.setLeft(a);
        c.setRight(d);
        
        System.out.println(method(c));
    }

    public static String method(BSTNode<String> rt){
        if(rt == null){
            return "";
        } else{
            String out = "";
            out += method(rt.getLeft());
            out += " " + rt.getValue() + " ";
            out += method(rt.getRight());
            return out;
        }
    }
        
}
