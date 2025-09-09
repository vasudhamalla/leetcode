
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(res,  new ArrayList<>(), candidates, target, 0, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> current, int[] candidates, int target, int i, int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(current));
            return;
        }

        if (sum < target) {
            for (int j = i; j < candidates.length; j++) {
                current.add(candidates[j]);
                sum +=  candidates[j];
                backtrack(res, current, candidates, target, j, sum);
                current.remove(current.size() - 1);
                sum -= candidates[j];
            }
        }
    }
}