class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class DetectCycleInLinkedList {
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true;
        }
        return false;
    }
}