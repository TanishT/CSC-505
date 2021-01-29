//https://codingbat.com/prob/p145416

public class sum {
  public boolean groupSum(int start, int[] nums, int target) {
    if (start == nums.length) return target == 0;
    else {
      return groupSum(start+1, nums, target-nums[start]) || groupSum(start+1, nums, target);
    }
  }
}
