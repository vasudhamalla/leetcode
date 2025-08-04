class Solution {
    public int compress(char[] chars) {
        char[] ch = new char[128];
        int n = chars.length;

        int idx=0;
        int count =1;

        if(n==1){
            return 1;
        }
        for(int i=1; i<=n; i++){
            
            if(i<n && chars[i] == chars[i-1]){
                count++;
            }else{
                chars[idx++]=chars[i-1];

                if(count>1){
                    char[] c = String.valueOf(count).toCharArray();
                    for(int j =0; j<c.length; j++){
                        chars[idx++]= c[j];
                    }
                }

                count=1;
            }
        }

        return idx;

    }
}