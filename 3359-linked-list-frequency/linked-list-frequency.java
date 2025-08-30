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
    public ListNode frequenciesOfElements(ListNode head) {
        Map<Integer, Integer> map1 = new HashMap<>();
        while (head != null) {
            map1.put(head.val, map1.getOrDefault(head.val, 0) + 1);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode l2 = dummy;
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            l2.next = new ListNode(entry.getValue());
            l2 = l2.next;
        }
        return dummy.next;
    }
}