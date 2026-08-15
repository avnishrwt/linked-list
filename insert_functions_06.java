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

    //insertion at last
    static node insertlast(node head , int n)
    {
        node addition = new node(n);
        if(head == null) return addition;
        
        node temp = head;



        while(temp.next!= null)
        {
            temp = temp.next;
        }

       
        addition.next = null;

        temp.next = addition;

        return head;
    }


    //insert at Kth position

    static node insertk(node head , int n , int k)
    {
        node addition = new node(n);

        if(head == null) return addition;

        if(k==1) 
        {
            node temp = addition;
            addition.next = head;
            head = temp;
            return head;
        }
        node temp = head;



        node prev = temp;
        int cnt =0;


        while(temp != null)
        {
            cnt++;
            if(cnt == k)
            {
                prev.next = addition;
                addition.next = temp;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }





        public static void main(String[] args) 
    {
        node head = null;
        
        head = insertlast(head, 10);
        head = insertlast(head, 20);
        head = insertlast(head, 30);
        head = insertlast(head, 40);

        head = insertfront(head, 90);
       
        head = insertk(head , 50 , 1);

        node temp = head;
        while(temp!= null)
        { 
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

