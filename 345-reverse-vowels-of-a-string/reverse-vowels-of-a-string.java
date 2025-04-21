class Solution {
    public String reverseVowels(String s) {
       char[] str1 = s.toCharArray();
       Stack<Character> str2 = new Stack<>();
       for(int i=0;i<str1.length;i++){
        if(str1[i] == 'a' || str1[i] == 'e' || str1[i] == 'i' || str1[i] == 'o' || str1[i] == 'u' || str1[i] == 'A' || str1[i] == 'E' || str1[i] == 'I' || str1[i] == 'O' || str1[i] == 'U'){
                str2.push(str1[i]);
        }
       }
       for(int i=0;i<str1.length;i++){
        if(str1[i] == 'a' || str1[i] == 'e' || str1[i] == 'i' || str1[i] == 'o' || str1[i] == 'u'|| str1[i] == 'A' || str1[i] == 'E' || str1[i] == 'I' || str1[i] == 'O' || str1[i] == 'U'){
                str1[i]=str2.pop();
        }
       }
       String str3 = new String(str1);
       return str3;
    }
}