import java.util.*;
class node
{
    int data;
    node next;

    node(int data1)
    {
        this.data = data1;
        this.next = null;
    }
}






public class insert_functions_06 {
    static Scanner sc = new Scanner(System.in);


    // for inserting at the front of linked list 
    static node insertfront(node head , int n)
    {
        node temp = new node(n); 
        temp.next = head;
        head = temp;


        return head;

    }


    


        public static void main(String[] args) 
    {
        node head = null;
        
        head = insertfront(head, 10);
        head = insertfront(head, 20);
        head = insertfront(head, 30);
        head = insertfront(head, 40);


       


        node temp = head;
        while(temp!= null)
        { 
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

