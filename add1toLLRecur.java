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

public class add1toLLRecur 
{

    public static node conversion(node head ,int[] arr)
    {
        int n = arr.length;
        node temp = head;


        for(int i =0 ; i < n ; i++)
        {
            if(i == 0)
            {
                node new_node = new node(arr[i]);
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



    static int adding1recurs(node head)
    {
        if(head == null)
        {
            return 1;
        }
        int carry = adding1recurs(head.next);
        head.data = head.data + carry;
        if(head.data < 10)
        {
            return 0;
        }

        head.data = 0;
        return 1; 
    }



    static void display(node head)
    {
        node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.print("NULL");
    }
    public static void main(String[] args) 
    {
        int[] arr = {1 , 5 , 9};

        node head = null;
        head = conversion(head , arr);
        display(head);


        int a = adding1recurs(head , 1);
    }
}



