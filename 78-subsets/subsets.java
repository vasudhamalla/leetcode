class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(cur, res, nums, 0);
        return res;
    }

    public void backtrack(List<Integer> cur, List<List<Integer>> res, int[] nums, int i) {
        res.add(new ArrayList<>(cur));

        for (int j = i; j < nums.length; j++) {
            cur.add(nums[j]);
            backtrack(cur, res, nums, j + 1);
            cur.remove(cur.size() - 1);
        }
    }

}