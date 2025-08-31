class Solution {
    public boolean isValid(String s) {
        char[] a = s.toCharArray();
        Stack<Character> s1 = new Stack<>();
        for(char i : a){
            if( i=='(' || i=='[' || i=='{'){
                s1.push(i);
            }
            else{
                if(s1.isEmpty()) return false;
                char top = s1.peek();
                if(i==')' && top !='(' || i==']' && top !='[' || i=='}' && top !='{') {return false;}
                else{
                    s1.pop();
                };
            }
        }
        return s1.isEmpty();     
    }
}