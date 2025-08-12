class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        int i;
        for(i=0;i<nums.length;i++){
            for(int l=i+1;l<nums.length;l++){
                if(nums[i]+nums[l]==target){
                     output[0]=i;
                    output[1]=l;
                }
            }
           
    
    }
     return output;

}
}