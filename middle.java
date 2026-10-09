
class node {
    int data;
    node next;

    node(int data1) {
        data = data1;
        next = null;
    }
}



public class middle 
{
    public static node middle(node head)
    {
        node slow = head;
        node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static node conversion(node head, int[] arr) 
    {
        int n = arr.length;
        if (n == 0) 
        {
            return null;
        }

        node temp = head;

        for (int i = 0; i < n; i++) 
        {
            if (i == 0) 
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


    public static void main(String[] args) 
    {
        int[] arr = {1 , 2 , 3 , 4 ,5 };

        node head = null;

        head = conversion(head, arr); 

        node mid = middle(head);

        System.out.println(mid.data);
       
    }
    
}
