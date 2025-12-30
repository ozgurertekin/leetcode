package leetcode.dsa.linkedlists;

import leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleOfTheLinkedListTest {
    @Test
    void testBasic() {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        ListNode result = middleOfTheLinkedList.middleNode(node1);
        assertEquals(node3, result);
    }

    @Test
    void testBasic2() {
        ListNode node4 = new ListNode(4, null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        ListNode result = middleOfTheLinkedList.middleNode(node1);
        assertEquals(node3, result);
    }
}
