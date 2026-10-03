//LECTURE 10 
// Extreme brute force solution - using stack and two traversal 
// Step 1 - input all the elements in Stack data structure 
// Step 2 - pop and check each line 
import java.util.*;
class node
{
    int data;
    node next;

    node(int data1)
    {
        data = data1;
        next = null;

    }
} 
public class palindromeLL 
{
    public static boolean palindrome(node head)
    {
        Stack<Integer> st = new Stack<>();
        
        node temp = head;
        while(temp != null)
        {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null)
        {
            if(temp.data != st.peek())
            {
                return false;
            }
            else
            {
                st.pop();
                temp = temp.next;
            }
        }
        return true;
    }


    public static node convert2arr(node head , int[] arr)
    {
        int n = arr.length;
        // first node connecting to the head 

        node temp = new node(arr[0]);
        head = temp;
        
        node p1 = head;

        for(int i = 1;  i <n ; i++)
        {
            node t = new node(arr[i]);
            p1.next = t;
            p1 = p1.next;
            
        }
        return head;
    }



    public static void display(node head)
    {
        node temp = head;
        
        if(temp == null)
        {
            System.out.println("Failed printing ");
            return;
        }

        while(temp != null)
        {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("NULL");


    }
    public static void main(String args[])
    {

        node head = null ;
        int[] arr = {1 , 2 , 2 , 1};
        head = convert2arr(head , arr);

        
        if(palindrome(head))
        {
            System.out.println("Yes the Linked List was palindrome ");
        }

        else
        {
            System.out.println("This was not a palindrome Linked List");
        }

       
    }
}
