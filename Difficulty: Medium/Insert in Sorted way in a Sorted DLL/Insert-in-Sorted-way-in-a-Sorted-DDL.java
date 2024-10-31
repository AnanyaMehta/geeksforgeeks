class Solution {
    public Node sortedInsert(Node head, int x) {
        Node dummy = new Node(Integer.MIN_VALUE);
        dummy.next = head;
        head.prev = dummy;
        head = dummy;
        while(head.next!=null && head.next.data<=x) head = head.next;
        Node temp = new Node(x);
        temp.next = head.next;
        head.next = temp;
        temp.prev = head;
        return dummy.next;
    }
}
