// My solution 

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
public class findingIntersection 
{   




    public static node conversion(node head , int[] arr)
    {
        int n = arr.length;
        if(n == 0)
        {
            return null;
        }

        node temp= head;

        for(int i =0 ; i <n ; i++)
        {
            if(i == 0)
            {
                node new_node = new node(arr[0]);
                head = new_node;
                temp = head;
            }
            else
            {
                node new_node = new node(arr[i]);
                temp.next = new_node;
                temp = temp.next;
            }
        }
        return head;
    }


    public static node reverse(node head)
    {
        if(head == null)
        {
            return null;
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


    public static node find(node head1 , node head2)
    {
        if(head1 == null || head2 == null)
        {
            return null;
        }
        node temp1 = head1;
        node temp2 = head2;
        node prev = head1;

        while(temp1 != null || temp2 != null)
        {
            
            if(temp1.data != temp2.data)
            {
                return prev;
            }
            else
            {
                prev = temp1;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        return null;
    }


    static void display(node head)
    {
        if(head == null)
        {
            System.out.println("Linked List is empty");
            return;
        }
        node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }


    public static void main(String[] args) 
    {
        int[] arr1 = {3 , 1 , 4 , 6 , 2};
        int[] arr2 = {1 , 2 , 4 , 5 , 4 , 6 , 2};

       node head1 = null;
       node head2 = null;

       head1 = conversion(head1, arr1);
       head2 = conversion(head1, arr2);
    
       head2 = reverse(head2);
       head1 = reverse(head1);

       node intersection = null;
       intersection = find(head1, head2);

       head1 = reverse(head1);

       display(intersection);

       System.out.println();
       System.out.println(intersection.data);

       
    }
    
}