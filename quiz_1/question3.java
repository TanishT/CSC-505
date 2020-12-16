import java.util.ArrayList;

public class question3 {
    public static void main(String[] args) {
        int[] values = {7,10,29};
        System.out.println(trimList(values, 50));
    }    

    public static ArrayList<Integer> trimList(int[] values, int threshold) {
        ArrayList<Integer> trimmed = new ArrayList<Integer>();
        for (int i : values) {
            if (i >= threshold) {
                trimmed.add(i);
            }
        }
        return trimmed;
    }
}