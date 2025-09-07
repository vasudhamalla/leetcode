class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> m1 = new HashMap<>();
        m1.put('2', "abc");
        m1.put('3', "def");
        m1.put('4', "ghi");
        m1.put('5', "jkl");
        m1.put('6', "mno");
        m1.put('7', "pqrs");
        m1.put('8', "tuv");
        m1.put('9', "wxyz");
        List<String> l1 = new ArrayList<>();
        if (digits == null || digits.length() == 0) {return l1;}
        char[] arr = digits.toCharArray();
         backtrack(digits, 0, new StringBuilder(), l1, m1);
    return l1;
    }
    private void backtrack(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> digitToLetters) {
        if (idx == digits.length()) {
            res.add(comb.toString());
            return;
        }
        
        String letters = digitToLetters.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backtrack(digits, idx + 1, comb, res, digitToLetters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }    
}