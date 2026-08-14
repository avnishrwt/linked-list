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



public class traversal_03 
{
    static node conversions(int[] arr)
    {
        node head = new node(arr[0]);
        node mover =head;

        for(int i = 1; i < arr.length ; i++)
        {
            node temp = new node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // for length of the linked list 

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

    public static void main(String[] args) 
    {
        int arr[] ={1 , 2 , 3 , 4 , 5};

        node head = conversions(arr);

        node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;

        }


        System.out.println();
        System.out.println(lengthofll(head));

    }
}