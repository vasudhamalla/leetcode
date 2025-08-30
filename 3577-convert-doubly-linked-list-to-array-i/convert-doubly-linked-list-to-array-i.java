/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
};
*/

class Solution {
    public int[] toArray(Node head) {
        var l2 = new ArrayList<Integer>();
        while(head != null){
            l2.add(head.val);
            head = head.next;
        }
        var r = new int[l2.size()];
        for(int i=0;i<r.length;i++){
            r[i] = l2.get(i);
        }
        return r;
    }
}