class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] candy = new int[candies.length];
        List<Boolean> result = new ArrayList<>();
        int s =0;
       for(int i=0;i<candies.length; i++){
            candy[i] = candies[i]+extraCandies;
            if(candies[i]>s){
                s= candies[i];
            }
       }
       for(int i=0;i<candy.length; i++){
            if(candy[i]>=s){
                result.add(true);
            }
            else{
                result.add(false);
            }
       }
       return result;
    }
}