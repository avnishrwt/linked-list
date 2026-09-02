class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removedup {

    public static Node insertLast(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static Node removeDup(Node head) {
        if (head == null) {
            return head;
        }

        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next.data == temp.data) {
                
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertLast(head, 10);
        head = insertLast(head, 10);
        head = insertLast(head, 10);
        head = insertLast(head, 20);
        head = insertLast(head, 20);
        head = insertLast(head, 30);
        head = insertLast(head, 40);

        System.out.print("LINKED LIST : ");
        printList(head);

        head = removeDup(head);

        System.out.println();

        System.out.print("LINKED LIST : ");
        printList(head);
    }
}