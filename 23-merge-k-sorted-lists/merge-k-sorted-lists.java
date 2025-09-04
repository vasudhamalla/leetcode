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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq1 = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i = 0; i < lists.length; i++) {
            ListNode head = lists[i];
            while (head != null) {
                pq1.add(head);
                head = head.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode l1 = dummy;
        while (!pq1.isEmpty()) {
            ListNode node = pq1.poll();
            node.next = null;
            l1.next = node;
            l1 = l1.next;
        }
        return dummy.next;
    }
}