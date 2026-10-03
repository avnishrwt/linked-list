class node
{
    node next;
    int data;

    node(int data1 )
    {
        data = data1;
        next = null;
    }

}
class linkedlistreverse 
{


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

        node head = null ;
        int[] arr = {1 , 2 , 3 , 4};
        head = convert2arr(head , arr);

        System.out.println("Printing the linked list :");
        display(head);

        head = reverse(head);
        System.out.println("Printing after the reverse ");

        display(head);
    }
}