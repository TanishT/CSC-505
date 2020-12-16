import java.util.ArrayList;

public class question2 {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<String>();
        text.add("test");
        text.add("testing testing 1 2 3");
        text.add("plz work");
        text.add("3");
        text.add("4");
        text.add("5");
        System.out.println(arrangeNouns(text));
    }

    public static boolean isNoun(String s) {
        if (s.equals("3") || s.equals("4") || s.equals("5")) {
            return true;
        }
        return false;
    }

    public static ArrayList<String> arrangeNouns(ArrayList<String> text) {
        ArrayList<String> updated = new ArrayList<String>();
        for (String word : text) {
            if (isNoun(word)) {
                updated.add(word);
            }
        }
        for (String word : text) {
            if (updated.contains(word) == false) {
                updated.add(word);
            }
        }
        return updated;
    }
}