class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(candidates, target, res, curr, 0, 0);
        return res;

    }

    public void backtrack(int[] candidates, int target, List<List<Integer>> res, List<Integer> curr, int sum, int i) {
        if (sum == target) {
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (sum < target) {
                if (sum + candidates[j] > target)
                    break;
                if (j > i && candidates[j] == candidates[j - 1])
                    continue;
                curr.add(candidates[j]);
                backtrack(candidates, target, res, curr, sum + candidates[j], j + 1);
                curr.remove(curr.size() - 1);
            }
        }
    }
}