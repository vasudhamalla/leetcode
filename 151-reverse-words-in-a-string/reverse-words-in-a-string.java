class Solution {
    public String reverseWords(String s) {
        Stack<String> str = new Stack<>();
        String[] str2 = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str2.length;i++){
            str.push(str2[i]);
        }
        while (!str.isEmpty()){
            result.append(str.pop());
            if(!str.isEmpty()){
                result.append(" ");
            }
        }
        return result.toString();
    }
}