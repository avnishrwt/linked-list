// Using HashSet

import java.util.HashSet;

class node {
    int data;
    node next;

    node(int data1) {
        data = data1;
        next = null;
    }
}



public class FindingCycle 
{
    public static node findcycle(node head)
    {
        HashSet<node> set = new HashSet<>();
        
        node temp = head;
        while(temp != null)
        {
            if(set.contains(temp))
            {
                return temp;
            }
            set.add(temp);

            temp = temp.next;
        }
        return null;
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
        int[] arr = {1 , 2 , 3 , 4 ,5 };

        node head = null;

        head = conversion(head, arr); 

        node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }


        // ****************
        // Joining the List 
        // ****************


        temp.next = head.next.next;
        node cycle = findcycle(head);


        // ****************
        // ****************
        // ****************

        if(cycle != null)
        {
            System.out.println(cycle.data);
        }
        else
        {
            System.out.println("NULL");
        }
        
       
    }
    
}
    
