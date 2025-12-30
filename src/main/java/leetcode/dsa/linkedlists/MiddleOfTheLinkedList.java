package leetcode.dsa.linkedlists;

import leetcode.util.ListNode;

/**
 * 876. Middle of the Linked List
 * EASY
 * Linked List
 * Two Pointers
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head,slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
