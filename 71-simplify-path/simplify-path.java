class Solution {
    public String simplifyPath(String path) {
        String[] a = path.split("/");
        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();
        if(a.length == 1) s1.push("/");
        for(String s : a){
            if(!s.equals("..") && !s .equals(".") && !s.equals("")){
                s1.push("/");
                s1.push(s);
            }
            else if(s.equals("..")){
                if(!s1.isEmpty()) s1.pop();
                if(!s1.isEmpty()) s1.pop();
            }

        }
        StringBuilder result = new StringBuilder();
        for (String str : s1) {
            result.append(str);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}