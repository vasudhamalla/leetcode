class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr2 = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = 0;
                sum = sum + nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    arr2.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        Set<List<Integer>> set1 = new LinkedHashSet<>(arr2);
        arr2 = new ArrayList<>(set1);
        return arr2;
    }
}