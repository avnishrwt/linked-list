public class SLLarray {

    // Converts an array into a linked list and returns the head
    static node conversion(int[] arr, node head) {
        node tail = null;
        for (int i = 0; i < arr.length; i++) {
            node newNode = new node(arr[i]);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Displays the linked list
    static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}