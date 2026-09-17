// code for checking how many nodes are there with more than average of infos of the linked list 

class Node {
    Node prev;
    Node next;
    int info;

    Node(int val) {
        info = val;
        next = this;
        prev = this;
    }
}

class CircularDoublyLinkedList {
    Node head;

    void insertEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tail = head.prev;
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
    }

    int average() {
        Node temp = head;
        int sum = 0;
        int c = 0;

        if (head == null) {
            System.out.println("this is an empty list");
            return 0;
        }

        while (temp.next != head) {
            sum += temp.info;
            c++;
            temp = temp.next;
        }
        sum += temp.info;
        c++;
        sum = sum / c;

        c = 0;
        temp = head;
        while (temp.next != head) {
            if (temp.info > sum)
                c++;
            temp = temp.next;
        }
        if (temp.info > sum)
            c++;

        return c;
    }
}

public class average {
    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40); 

        int result = list.average();
        System.out.println("Count of elements greater than average: " + result);
    }
}