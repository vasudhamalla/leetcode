class Solution {
    public int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int n = (arr[arr.length-1]-arr[0]) /(arr.length);
        if(n==0) return arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(n != arr[i+1]-arr[i]){
                return arr[i]+n;
            }
        }
        return n;
    }
}