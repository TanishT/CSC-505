public class array_3 {
    public static int countClumps(int[] nums) {
        boolean clump = false;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length-1 && nums[i] == nums[i+1]) {
                clump = true;
            } else if (clump == true) {
                count++;
                clump = false;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,1,1};
        System.out.println(countClumps(nums));
    }
}