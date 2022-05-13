package LinkedList.SinglyLinkedList;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    ListNode (int x) {
        val = x;
        next = null;
    }
}

public class DeleteNthNodeFromTheEnd {
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
        int len = 0;
        ListNode curr = head;
        while (curr.next != null) {
            len++;
            curr = curr.next;
        }
        curr = head;
        for (int i = 1 ; i < len - n + 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
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
