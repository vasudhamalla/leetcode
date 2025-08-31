/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = new ListNode(0);
        ListNode l3 =l2;
        int n=0;
        while (l1 != null) {
            if (l1.val != 0) {
                n += l1.val; 
            } else {
                l3.next = new ListNode(n);
                l3 = l3.next;
                n = 0; 
            }
            l1 = l1.next; 
        }
        return l2.next.next;
    }
}