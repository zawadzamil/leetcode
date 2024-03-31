import org.w3c.dom.Node;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        // do nothing if the list is empty
        if (head == null) {
            return null;
        }

        ListNode current = head;

        // compare the current node with the next node
        while (current.next != null)
        {
            if (current.val == current.next.val)
            {
                current.next = current.next.next;
            }
            else {
                current = current.next;    // only advance if no deletion
            }
        }

        return head;
    }

    public static void main(String[] args) {

    }
}
