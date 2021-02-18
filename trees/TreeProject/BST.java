public class BST<E> {
    public static String method(BSTNode<String> rt){
        if(rt == null){
            return "";
        } else{
            String out = "";
            out += method(rt.getLeft());
            out += rt.getValue();
            out += method(rt.getRight());
            return out;
        }
    }
        
}
