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


public class SLLarray 
{
    public static node conversion(int[] arr, node head)
    {
        node tail = null;
        for(int val : arr)
        {
            node newNode = new node(val);
            if(head == null)
            {
                head = newNode;
                tail = newNode;
            }
            else
            {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    static void traverse(node head)
    {
        node temp = head;

        if(head == null)
        {
            System.out.println("Empty List");
        }
        else
        {

            while(temp != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            
            System.out.print("NULL");
            System.out.println();
        }
    }


    public static void main(String[] args) 
    {
        node head = null;

        int[] arr = {1 , 2 , 3 , 4 , 5 , 6};


        head = conversion(arr , head);

        traverse(head);
    }
}