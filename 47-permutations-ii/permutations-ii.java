class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(curr,res,nums,used);
        return res;
    }
    public void backtrack(List<Integer> curr, List<List<Integer>> res,  int[] nums, boolean[] used){
        if(curr.size() == nums.length){
            if(!res.contains(curr)){
            res.add(new ArrayList<>(curr));}
            return;
        }
        for(int j=0;j<nums.length;j++){
            if (used[j]) continue;
            curr.add(nums[j]);
            used[j]=true;
            backtrack(curr,res,nums,used);
            used[j] = false;
            curr.remove(curr.size()-1);
        }
    }
}