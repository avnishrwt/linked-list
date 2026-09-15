public class Sorting {

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

    static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static node middle(node head) {
    node slow = head;
    node fast = head.next;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

    static node merge(node left, node right) {
        node dummy = new node(-1);
        node temp = dummy;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        temp.next = (left != null) ? left : right;
        return dummy.next;
    }

    static node mergesort(node head) {
        if (head == null || head.next == null) {
            return head;
        }
        node mid = middle(head);
        node right = mid.next;
        mid.next = null;

        node left = mergesort(head);
        right = mergesort(right);

        return merge(left, right);
    }

    public static void main(String[] args) {
        node head = null;
        int[] arr = { 5, 8, 1, 3, 4, 5 };

        head = conversion(arr, head);

        System.out.print("Before sorting: ");
        display(head);

        head = mergesort(head);

        System.out.print("After sorting: ");
        display(head);
    }
}