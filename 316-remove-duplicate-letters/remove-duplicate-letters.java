class Solution {
    public String removeDuplicateLetters(String s) {
        int[] frequency = new int[26];
        boolean[] s1 = new boolean[26];
        for(char c : s.toCharArray()) frequency[c-'a']++;
        Stack<Character> s2 = new Stack<>();
        for(char c: s.toCharArray()){
            frequency[c-'a']--;
            if(!s1[c - 'a']) { ;
            while (!s2.isEmpty() && s2.peek() > c && frequency[s2.peek() - 'a'] > 0) {
            s1[s2.pop() - 'a'] = false;
        }
        s2.push(c);
     s1[c - 'a'] = true;
        }
        }
    StringBuilder res = new StringBuilder();
    for (char c : s2) {
        res.append(c);
    }
    return res.toString();
    }
}