class Solution {
    public int maxArea(int[] height) {
         int max_area =0;
         int left =0;
         int right = height.length-1 ;
         while(left < right){
            int a = right -left;
            max_area = Math.max(max_area, a* Math.min(height[left],height[right]));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
         }
         return max_area;
    }
}