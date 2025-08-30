/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set1 = new HashSet<>(0);
        if(head == null) return false;
       while(head.next!=null){
        if(set1.contains(head)){
            return true;
        }else{
             set1.add(head);
        }
        head = head.next;

       }
       return false;
    }
}