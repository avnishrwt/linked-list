class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class sum_of_two {

    public static Node addTwoNumbers(Node num1, Node num2) {
        Node dummyHead = new Node(-1);
        Node curr = dummyHead;
        Node temp1 = num1;
        Node temp2 = num2;
        int carry = 0;

        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) sum += temp1.data;
            if (temp2 != null) sum += temp2.data;

            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }

        if (carry > 0) {
            Node newNode = new Node(carry);
            curr.next = newNode;
        }

        return dummyHead.next;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // First Linked List: 2 -> 4 -> 3 (represents the number 342)
        Node num1 = new Node(2);
        num1.next = new Node(4);
        num1.next.next = new Node(3);

        // Second Linked List: 5 -> 6 -> 4 (represents the number 465)
        Node num2 = new Node(5);
        num2.next = new Node(6);
        num2.next.next = new Node(4);

        System.out.print("List 1: ");
        printList(num1);

        System.out.print("List 2: ");
        printList(num2);

        // Perform addition (342 + 465 = 807, stored as 7 -> 0 -> 8)
        Node result = addTwoNumbers(num1, num2);

        System.out.print("Sum:    ");
        printList(result);
    }
}