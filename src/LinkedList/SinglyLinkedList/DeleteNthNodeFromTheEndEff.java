package LinkedList.SinglyLinkedList;

import java.util.List;

public class DeleteNthNodeFromTheEndEff {
    public static void main(String[] args) {
        ListNode head=new ListNode(10);
        head.next=new ListNode(20);
        head.next.next=new ListNode(30);
        head.next.next.next=new ListNode(40);
        head.next.next.next.next=new ListNode(50);
        printlist(head);
        head = deleteNthFromEnd(head,2);
        printlist(head);
    }
    public static ListNode deleteNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;
        for (int i = 0; i < n ; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }

    public static void printlist (ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
