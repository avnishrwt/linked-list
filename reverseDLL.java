public class node 
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

public class reverseDLL 
{

    public static node insertlast(node head , int val)
    {
        node new_node = new node(val);

        if(head == null)
        {
            return new_node;
        }

        node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new_node;
        new_node.prev = temp;
        new_node.next = null;


        return head;
    }



    static void traversal(node head)
    {
        node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) 
    {
        node head = null;
        head = insertlast(head, 10);
        head = insertlast(head, 20);
        head = insertlast(head, 30);
        head = insertlast(head, 40);
        head = insertlast(head, 50);
        head = insertlast(head, 60);



        traversal(head);

    }
}
