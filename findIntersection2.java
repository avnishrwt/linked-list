import java.util.*;

class node {
    int data;
    node next;

    node(int data1) {
        data = data1;
        next = null;
    }
}

public class findIntersection2 {

    // Optimized using HashSet instead of HashMap
    static node intersection(node head1, node head2) {
        HashSet<node> set = new HashSet<>();
        node temp = head1;

        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }

        temp = head2;
        while (temp != null) {
            if (set.contains(temp)) {
                return temp; // First intersection node found
            }
            temp = temp.next;
        }
        return null;
    }

    public static node conversion(node head, int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return null;
        }

        node temp = head;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                node new_node = new node(arr[0]);
                head = new_node;
                temp = head;
            } else {
                node new_node = new node(arr[i]);
                temp.next = new_node;
                temp = temp.next;
            }
        }
        return head;
    }

    static void display(node head) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1};
        int[] arr2 = {1, 2, 5};

        node head1 = null;
        node head2 = null;

        head1 = conversion(head1, arr1);
        head2 = conversion(head2, arr2); // Fixed typo here

        // Common intersection list create kar rahe hain: 4 -> 6 -> 2
        node common = new node(4);
        common.next = new node(6);
        common.next.next = new node(2);

        // Dono lists ko common part par attach kar rahe hain
        head1.next.next = common; // 3 -> 1 -> 4 -> 6 -> 2
        head2.next.next.next = common; // 1 -> 2 -> 5 -> 4 -> 6 -> 2

        node inter = intersection(head1, head2);

        if (inter != null) {
            System.out.println("Intersection Node Data: " + inter.data);
        } else {
            System.out.println("No Intersection Found (NULL)");
        }
    }
}