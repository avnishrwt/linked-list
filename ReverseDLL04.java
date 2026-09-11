public class ReverseDLL04 
{
    public static node reverseDLL(node head)
    {
        node curr = head;
        node temp = null;

        while(curr != null)
        {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp != null)
        {
            head = temp.prev;
        }
        return head;
    }


    public static void main(String[] args) 
    {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        node head = null;
        head = DLLarray.conversion(arr , head);
        DLLarray.traversal(head);
        
        System.out.println();

        head = reverseDLL(head);
        DLLarray.traversal(head);

    }
    
}