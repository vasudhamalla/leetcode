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
    public boolean isPalindrome(ListNode head) {
         ListNode copyHead = null;
        ListNode copyTail = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode node = new ListNode(curr.val);
            if (copyHead == null) {
                copyHead = node;
                copyTail = node;
            } else {
                copyTail.next = node;
                copyTail = node;
            }
            curr = curr.next;
        }
        ListNode l1 = copyHead;
        ListNode prev = null;
        while (l1 != null) {  
            ListNode next = l1.next;
            l1.next = prev;
            prev = l1;
            l1 = next;
        }
        ListNode l2 = prev;
        int c=0;
        while(head != null && l2 != null){
            if(head.val != l2.val){
                c++;
            }
            head = head.next;
            l2 = l2.next;
            
        }
        return (c > 0) ? false : true;
    }

    }