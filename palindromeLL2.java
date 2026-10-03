// Step1 - use slow and fast pointeer (tortoise and hare algo) to find the mid of the linked list
// Step2 - reverse the second half of this linked List 
// Step3 - one pointer at head one at new head - traverse and check linked list for palindrome 



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
public class palindromeLL2 
{

    // For finding the middle 

    public static node middle(node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        node slow = head;
        node fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Reversing the second part of the Linked List

    public static node reverse(node head)
    {

        if(head == null || head.next == null)
        {
            return head;
        }


        node prev = null;

        node curr = head;
        while(curr != null)
        {
            node next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

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

    public static boolean palindrome(node head1 , node head2)
    {
        if(head1 == null || head2 == null)
        {
            return true;
        }

        while(head2 != null)
        {
            if(head1.data != head2.data)
            {
                return false;
            }

            else
            {
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        return true;

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
        int[] arr = {1 , 2 , 2 , 2 , 1};
        head = convert2arr(head , arr);


        node slow = middle(head);  // Slow pointer stops at this point 
        

        node new_head = reverse(slow.next);
        node second = new_head;


        if(palindrome(head, second))
        {
            System.out.println("Yes the Linked List is palindrome");
        }
        else
        {
            System.out.println("NO the Linked List is not palindrome");
        }

        
    }
    
}
