class Solution {
    int c=0;

    public String mergeAlternately(String word1, String word2) {
       if(word1.length() > word2.length()){
        c=  word1.length();
       }
       else{
        c=word2.length();
       }
       int f = word1.length() + word2.length();
       char[] str1 = word1.toCharArray();
       char[] str2 = word2.toCharArray();
       char[] str3 = new char[f];
       int j =0;
       for(int i=0; i<c; i++){
        if (i < word1.length()){
          str3[j] = str1[i];
          j++;
        }
           if (i < word2.length()){
          str3[j] =str2[i];
          j++;
           }
       }
       String b = new String(str3);

     return b;
    }
}