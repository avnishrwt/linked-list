class OddEven 
{
    public static node seggregate(node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        node odd = head;
        node even = head.next;
        node evenhead = even;

        while(even != null && even.next != null)
        {

            odd.next = even.next;

            odd = odd.next;

            even.next = odd.next;

            even = even.next;
        }

        odd.next = evenhead;
        return head;
    }

    public static void main(String[] args) 
    {
        int[] arr = {1 , 2 , 3 , 4 , 5 , 6};

        node head = null;
        head = SLLarray.conversion(arr, head);
        head = seggregate(head);


        node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        
        System.out.print("NULL");
        System.out.println();
    }
}