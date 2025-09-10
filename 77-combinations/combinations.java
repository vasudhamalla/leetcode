class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(curr, res, k, 0, nums);
        return res;
    }

    public void backtrack(List<Integer> curr, List<List<Integer>> res, int k, int i, int[] nums) {
        if (curr.size() == k) {
            res.add(new ArrayList<>(curr));
            return;
        }
        if (i < nums.length) {
            curr.add(nums[i]);
            backtrack(curr, res, k, i + 1, nums);
            curr.remove(curr.size() - 1);
            backtrack(curr, res, k, i + 1, nums);
        }
    }
}