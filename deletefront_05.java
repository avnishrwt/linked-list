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



public class deletefront_05
{
    
    
    static Scanner sc = new Scanner(System.in);
    static node insertfront(node head , int n)
    {
        node temp = new node(n); 
        temp.next = head;
        head = temp;


        return head;

    }

    
    // function to get the length of the linked list 
    public static int lengthofll(node head)
    {
        int count=0;
        node temp = head;

        while(temp != null)
        {
            
            temp = temp.next;
            count++;

        }

        return count;

    }



    // function to remove the head of the linked list 
    static node removeshead(node head)
    {
       if(head == null) return null;

        head = head.next; 

        return head;
    }

    // function to remove the tail of the linked list
    static node removetail(node head)
    {
        if(head == null) return null;   // when there is no node (EMPTY)
        if(head.next == null) return null ;   // only one element so what am i gonna remove if there is no linked list 

    
        node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        } 
        temp.next = null;

        
        return head;
    }


    static node removek(node head , int k)
    {
        if(head == null) return head;

        if(k==1)
        {
            head = head.next;
            return head;
        }

        else
        {
        node temp =head ;
        for(int i = 1 ; i < k-1 ; i++)
        {


        if(temp.next == null) return head;   // k is greater than list length


            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

        return head;
    }




    
    public static void main(String[] args) 
    {
        node head = null;
        for(int i =0 ; i < 5 ; i++)
        {
            System.out.println("input the " + ((int)i+1) + " member of the list");

            
            head = insertfront(head, sc.nextInt());
        }


        head = removek(head, 1);



        node temp = head;
        while(temp!= null)
        { 
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}