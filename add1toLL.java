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
public class add1toLL 
{

    public static node addinng1(node head)
    {
        node temp = head;
        int carry = 1;

        while(temp != null)
        {
            temp.data = temp.data + carry ;


            if(temp.data < 10 )
            {
                carry =0;
                break;
            }
            else
            {
                temp.data =0;    // yha pe carry 1 hi rhega

            }

            temp = temp.next;
        }



        // agar pura kaam krne ke baad bi carry 1 hai to fir ye kro   9999 wale cases ke liye
        
        if(carry ==1)
        {
            node new_node = new node(1);

            head = reverse(head);
            new_node.next = head;
            return new_node;
        }

        head = reverse(head);

        return head;
    }


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

        int[] arr = {1 , 5 , 9};

        node head = null;
        head = convert2arr(head, arr);

        head = reverse(head);     //  Reversed Linked List 

        head = addinng1(head);

        display(head);

        

        
    }
    
}