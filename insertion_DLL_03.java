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
    // insertion before the head 
    public static node insert_before_head(node head , int val)
    {
        node new_head = new node(val , head , null);
        head.prev = new_head;
        return new_head;
    }


    // insertion before the tail 
    public static node insert_before_tail(node head , int val)
    {

        if(head.next == null)
        {
            return insert_before_head(head , val);
        }

        node tail = head;
        while(tail.next != null)
            {
                tail = tail.next;  
            }
            
            node back = tail.prev;
            
            node new_node = new node(val , tail , back);

            back.next = new_node;
            tail.prev = new_node;
            
            
            return head;
        }


        static void traverse(node head)
        {
            node temp = head;

            while(temp!= null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    public static void main(String[] args) 
    {
        node head = new node(10);

        head = insert_before_head(head , 20);

        head = insert_before_tail(head , 30);
        
        traverse(head);
    }
}
