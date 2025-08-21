class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> str = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String a = new String(arr);
            if(!str.containsKey(a)){
                str.put(a,new ArrayList<>());
            } 
            str.get(a).add(s);         
        } 
         return new ArrayList<>(str.values());
    }
}