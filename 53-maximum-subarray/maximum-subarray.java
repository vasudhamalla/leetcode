class Solution {
    public int maxSubArray(int[] nums) {
            int maximum_sum = nums[0];
            int current_sum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                current_sum = Math.max(nums[i], current_sum+nums[i]);
                maximum_sum = Math.max(maximum_sum, current_sum);
            }
            return maximum_sum;
        }

}