import java.util.*; 

public class question3 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,2,3,4};
        System.out.println(noDupes(nums));
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