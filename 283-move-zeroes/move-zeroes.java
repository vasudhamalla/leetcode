class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l =0;
        for(int i=0;i<n;i++){
            if (nums[i]!=0){
                int t = nums[i];
                nums[i] = nums[l];
                nums[l]=t;
                l++;
            }                
            }
        }

    }