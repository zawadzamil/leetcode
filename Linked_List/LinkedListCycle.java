package Linked_List;

import java.util.HashSet;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode turtle = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;

            if (turtle == hare) {
                return true; // Cycle detected
            }
        }

//        HashSet<ListNode> set = new HashSet<>();
//
//        while (head != null) {
//
//            if (set.contains(head)) {
//                return true; // Cycle detected
//            }
//            set.add(head);
//            head = head.next;
//
//        }
        return false;

    }

    public static ListNode createLinkedListWithCycle(int[] values, int pos) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode[] nodes = new ListNode[values.length];

        // Create nodes
        for (int i = 0; i < values.length; i++) {
            nodes[i] = new ListNode(values[i]);
        }

        // Connect nodes
        for (int i = 0; i < values.length - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        // Create a cycle
        if (pos >= 0 && pos < values.length) {
            nodes[values.length - 1].next = nodes[pos];
        }

        return nodes[0];
    }

    public static void main(String[] args) {

        int[] values = {-21, 10, 17, 8, 4, 26, 5, 35, 33, -7, -16, 27, -12, 6, 29, -12, 5, 9, 20, 14, 14, 2, 13, -24, 21, 23, -21, 5};
        int pos = -1;

        ListNode head = createLinkedListWithCycle(values, pos);

        LinkedListCycle linkedListCycle = new LinkedListCycle();
        boolean hasCycle = linkedListCycle.hasCycle(head);

        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
