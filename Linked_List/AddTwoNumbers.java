package Linked_List;

import java.math.BigInteger;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder list1 = new StringBuilder();
        StringBuilder list2 = new StringBuilder();

        while (l1 != null) {
            list1.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            list2.append(l2.val);
            l2 = l2.next;
        }

        BigInteger firstNumber = new BigInteger(list1.reverse().toString());
        BigInteger secondNumber = new BigInteger(list2.reverse().toString());

        BigInteger sum = firstNumber.add(secondNumber);


        String result = sum.toString();


        ListNode current = new ListNode();
        ListNode temp = current;

        for (int i = result.length() - 1; i >= 0; i--) {
            current.val = Integer.parseInt(String.valueOf(result.charAt(i)));
            if (i > 0) {
                current.next = new ListNode();
                current = current.next;
            }
        }
        return temp;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

    }

    public static ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0); // Dummy node to simplify the code
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next; // Skip the dummy node
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;

        int[] values = {1, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        ListNode head = createLinkedList(values);


        printList(addTwoNumbers.addTwoNumbers(a1, head));
    }

}
