class node 
{
    int data;
    node next;


    node(int data1)
    {
        this.data = data1;
    }
}    
public class insertfront_04 
{   
    static node insertfront(node head ,int n)
    {
        node temp = new node(n); 
        temp.next = head;
        head = temp;



        return head;
    }

    
    public static void main(String[] args) 
    {
        node head = new node(20);

        head = insertfront(head, 10);

        System.out.println(head.data); // 10


        node temp;

        temp = head;
        temp = temp.next;


        System.out.println(temp.data);  //20
    }
}
