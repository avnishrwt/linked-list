class node
{
    int data;
    node next;
    node prev;


    node(int data1)
    {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }


    node(int data1 , node next1 , node prev1 )
    {
        this.data = data1;
        this.next = next1;
        this.prev = prev1;
    }
}


public class insertion_DLL_03 
{
    public static node insert_head(node head)
    {
        node new_head = new node(20 , head , null);
        head.prev = new_head;
        return new_head;
    }
    public static void main(String[] args) 
    {
        node head = new node(10);

        head = insert_head(head);

        System.out.println(head.data);
    }
}
