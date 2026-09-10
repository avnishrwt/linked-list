class node
{
    int data;
    node next;
    node prev;

    node(int data1)
    {
        data = data1;
        next = null;
        prev = null;
    }
}

public class DLLarray 
{

    public static node conversion(int[] arr , node head)
    {                
        int n = arr.length;
        node ptr = head;

        for(int i =0 ;i < n ; i++)
        {
            node temp = new node(arr[i]);
            if(head == null)
            {
                head = temp;
                ptr = temp;
            }
            else
            {
                ptr.next = temp;
                temp.prev = ptr;
                ptr = ptr.next;
                
            }
        }
        return head;
    }
    

    static void traversal(node head)
    {
        node temp = head;
        if(head == null)
        {
            System.out.println("The List is empty");
            return;
        }

        System.out.println("THE LIST : \n");
        while(temp!= null)
        {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }


    public static void main(String[] args) 
    {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6};
        node head = null;

        head = conversion(arr , head);
        traversal(head);
        
    }
}
