import java.util.ArrayList;

public class question1 {
    public static void main(String[] args) {
        ArrayList<String> burger = new ArrayList<String>();
        burger.add("bun");
        burger.add("pickles");
        burger.add("lettuce");
        burger.add("cheese");
        burger.add(1, "patty");
        System.out.println(burger);
    }
}