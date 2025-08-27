class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int n = (arr[arr.length-1]-arr[0]) /(arr.length);
        for(int i=0;i<arr.length-1;i++){
            if(n != arr[i+1]-arr[i]){
                return arr[i]+n;
            }
        }
        return arr[0];
    }
}