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
    public String gameResult(ListNode head) {
        int c=0;
        int m=0;
        while(head != null){
            if(head.next != null){
            if(head.val > head.next.val){
                m++;
            }
            else c++; }
            head = head.next.next;
        }
        if(m==c) return "Tie";
        else if (m>c) return "Even";
        else return "Odd";
    }
}