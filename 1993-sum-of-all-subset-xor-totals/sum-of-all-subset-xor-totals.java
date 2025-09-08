class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), res);
        int sum = 0;
        for (int i = 0; i < res.size(); i++) {
            List<Integer> l1 = res.get(i);
            int xor = 0;
            for (int j : l1) {
                xor ^= j;
            }
            sum += xor;
        }
        return sum;
    }

    public void backtrack(int[] nums, int id, List<Integer> current, List<List<Integer>> res) {
        if (id == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[id]);
        backtrack(nums, id + 1, current, res);
        current.remove(current.size() - 1);
        backtrack(nums, id + 1, current, res);
    }

}