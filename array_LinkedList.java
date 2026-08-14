class node
{
    int info;
    node next;


    node(int info1 , node next1)
    {
        this.info = info1;
        this.next = next1;
    }

    node(int info1)
    {
        this.info = info1;
        this.next = null;
    }
}


public class array_LinkedList
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


    public static void main(String[] args) 
    {
        int arr[] ={1 , 2 , 3 , 4 , 5};

        node head = conversions(arr);

        System.out.println(head.info);

    }
}