package LinkedList.SinglyLinkedList;

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