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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list1 = head;
        while (list1 != null && list1.next != null){
            if(list1.val == list1.next.val){
                list1.next= list1.next.next;
            }
            else{
                list1 = list1.next;
            }
        }
        return head;
        
    }
}