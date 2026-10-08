import java.util.*;

class node {
    int data;
    node next;

    node(int data1) {
        data = data1;
        next = null;
    }
}


public class findIntersection3 
{

        public static node findinter(node head1 , node head2)
        {
            if (head1 == null || head2 == null) return null;

            node temp1 = head1;
            node temp2 = head2;

            while(temp1 != temp2)
            {
                
                if(temp1 != null) {
                temp1 = temp1.next;
            } else {
                temp1 = head2; 
            }

            
            if(temp2 != null) {
                temp2 = temp2.next;
            } else {
                temp2 = head1; 
            }

                

            }
            return temp1;
        }

        public static node conversion(node head, int[] arr) 
        {
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

    static void display(node head) 
    {
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

public static void main(String[] args) 
    {
        int[] arr1 = {3, 1};
        int[] arr2 = {1, 2, 5};

        node head1 = null;
        node head2 = null;

        head1 = conversion(head1, arr1); 
        head2 = conversion(head2, arr2);

        node intersectNode = new node(8);
        intersectNode.next = new node(7);

        head1.next.next = intersectNode; 

        head2.next.next.next = intersectNode; 

        System.out.println("Intersection Node Data: " + findinter(head1, head2).data);
    }
}