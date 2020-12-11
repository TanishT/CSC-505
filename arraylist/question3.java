import java.util.*; 

public class question3 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,2,3,4, 5,5, 6,6, 6,7, 5,5,9};
        System.out.println(noDupes(nums));
        System.out.println(noDupes2(nums));
    }

    public static ArrayList<Integer> noDupes2(int[] numbers) {
        ArrayList<Integer> unique = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            boolean in = false;
            for (int j = 0; j < unique.size(); j++) {
                if (numbers[i] == unique.get(j)) {
                    in = true;
                }
            }
            if (!in) {
                unique.add(numbers[i]);
            }
            in = false;
        }
        return unique;
    }

    public static ArrayList<Integer> noDupes(int[] numbers) {
        Set<Integer> unique = new HashSet<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            unique.add(numbers[i]);
        }
        ArrayList<Integer> ret = new ArrayList<Integer>(unique);
        return ret;
    }
}