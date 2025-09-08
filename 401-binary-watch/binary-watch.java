class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> l1 = new ArrayList<>();
        for(int h=0; h<12; h++){
            for(int m=0; m<60;m++){
                if(Integer.bitCount(h)+Integer.bitCount(m) == turnedOn){
                    l1.add(h +":"+String.format("%02d", m));
                }
            }
        }
        return l1;
    }
}