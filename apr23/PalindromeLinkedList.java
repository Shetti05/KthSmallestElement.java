class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class PalindromeLinkedList {
    static boolean isPalindrome(Node head) {
        Node slow=head, fast=head;
        Node prev=null, temp;

        while(fast!=null && fast.next!=null) {
            fast=fast.next.next;
            temp=slow.next;
            slow.next=prev;
            prev=slow;
            slow=temp;
        }

        if(fast!=null) slow=slow.next;

        while(slow!=null && prev!=null) {
            if(slow.data!=prev.data) return false;
            slow=slow.next;
            prev=prev.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        System.out.println(isPalindrome(head));
    }
}