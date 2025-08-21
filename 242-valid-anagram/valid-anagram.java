class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        String str1 = new String(a);
        char[] b = t.toCharArray();
        Arrays.sort(b);
        String str2 = new String(b);
        return str1.equals(str2);
    }
}