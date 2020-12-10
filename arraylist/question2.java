import java.util.ArrayList;

public class question2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("cornbread");
        list.add("baked beans");
        list.add(1,"brisket");
        list.add(list.get(0));
        list.remove(0);

        //predicted order: brisket, baked beans, cornbread
        System.out.println(list);
    }
}
