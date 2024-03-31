package Linked_List;

public class RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        while (head != null && head.next != null) {
            if (head.val == n) {
                head = head.next;
                return head;
            }
            head = head.next;

        }
        return null;
    }
}
