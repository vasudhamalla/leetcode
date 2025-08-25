class Solution {
    public int search(int[] nums, int target) {
        int c=0;
        for(int num:nums){
            c++;
            if(num == target){
                return c-1;
            }
        }
        return -1;
    }
}