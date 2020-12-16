import java.util.ArrayList;

public class question1 {
    public static void main(String[] args) {
        ArrayList<String> lunch = new ArrayList<String>();
        lunch.add("soup");
        lunch.add("fries");
        lunch.add("sandwich");
        lunch.add("salad");
        lunch.remove(1);
        lunch.remove(2);
        System.out.println(lunch);
    }
}